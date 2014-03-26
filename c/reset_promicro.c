#include	<stdio.h>
#include	<unistd.h>
#include	<fcntl.h>
#include	<termios.h>

/*
	This program aim to reset the Pro Micro Sparkfun (arduino clone) for
		programming it with avrdude which run out of sync without it.
	It is done by opening the serial port at 1200 bauds (default to /dev/ttyACM0)
		waiting a few seconds and then closing it.
*/



void main(int argc, char **argv){
	int mainfd = 0;
	char *f_tty = "/dev/ttyACM0";
	
	struct termios options;

	if(argc > 1){
		f_tty = argv[1];
	}
	mainfd = open(f_tty, O_RDWR | O_NOCTTY | O_NDELAY);
	if(mainfd == -1){
		fprintf(stderr, "Unable to open %s\n", f_tty);
	}

	fcntl(mainfd, F_SETFL, FNDELAY);

	tcgetattr(mainfd, &options);
	cfsetispeed(&options, B1200);
	cfsetospeed(&options, B1200);

	options.c_cflag |= (CLOCAL | CREAD);
	options.c_cflag &= ~PARENB;
	options.c_cflag &= ~CSTOPB;
	options.c_cflag &= ~CSIZE;
	options.c_cflag |=  CS8;
	options.c_cflag &= ~CRTSCTS;  


	options.c_lflag &= ~(ICANON | ECHO | ISIG);
	   
	tcsetattr(mainfd, TCSANOW, &options);

	sleep(3); /*Try to program the board during the sleep*/
	
	close(mainfd);
}
