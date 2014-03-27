#!/bin/sh

cd /usr/share/applications

function print_usage(){
cat<<EOF
Usage: $0 <file> [file_list]
Hide application from launcher in gnome by appending "NoDisplay=true" at the end
	of the concerned .desktop filename.
You can use a file containing every .desktop filenames you want to hide. 
	Use $0 < file_list. There is one included on my github (keiwop).
EOF
	exit 2
}



if [ $# -eq 0 ]; then
	print_usage
fi

for i in `cat $@`; do
	if [ -e $i ]; then
		if [ "`tail -n 1 $i`" != "NoDisplay=true" ]; then 
			echo -ne ">\t$i has been turned invisible\n"
			echo "NoDisplay=true" >> $i
		else
			echo -ne "$i is already modified\n"
		fi
	else
		echo -ne ">>\t\t$i doesn't exists\n"
	fi
done


