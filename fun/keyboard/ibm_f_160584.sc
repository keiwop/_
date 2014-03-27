
remapblock
	F3			F4
	F4			F5
	F5			INSERT
	F6			DELETE
	F7			SELECT_2
	F8			SELECT_3
	F9			SELECT_4
	F10			SELECT_5
#Yup, those selects aren't used anywhere else for the moment
	
	Q			A
	A			Q
	W			Z
	Z			W
	SEMICOLON	M
	M			SLASH
	CAPS_LOCK	RALT
	ESC			QUOTE
	QUOTE		SEMICOLON
#	BACK_QUOTE	SELECT_6
	SLASH		BACK_QUOTE
	
	PAD_1		LEFT
	PAD_2		DOWN
	PAD_3		RIGHT
	PAD_4		END
	PAD_5		UP
	PAD_6		PAGE_DOWN
	PAD_7		HOME
	PAD_8		SELECT_7
	PAD_9		PAGE_UP
	PAD_0		DELETE
	PAD_PERIOD	INSERT
	PAD_MINUS	PRINTSCREEN
	PAD_ASTERIX	ESC
	PAD_PLUS	LGUI
	SCROLL_LOCK	CAPS_LOCK

endblock


macroblock
#	CTRL + L when F2 is pressed to clear screen
	macro			F2
		SET_META	LCTRL
		PRESS		L
		CLEAR_META	LCTRL
	endmacro
	
#	ALT + F4 when F4 is pressed, be careful
	macro			F4
		SET_META	ALT
		PRESS		F4
		CLEAR_META	ALT
	endmacro
endblock


macroblock
#	È	CTRL + SHIFT + U + 00C8		
	macro			SELECT_6	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		C
		PRESS		8
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	è	CTRL + SHIFT + U + 00E8		
	macro			SELECT_6	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		8
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	É	CTRL + SHIFT + U + 00C9	
	macro			SELECT_6	RSHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		C
		PRESS		9
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	é	CTRL + SHIFT + U + 00E9	
	macro			SELECT_6
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		9
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	Ê	CTRL + SHIFT + U + 00CA	
	macro			E	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		C
		PRESS		A
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	ê	CTRL + SHIFT + U + 00EA	
	macro			E	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		A
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
endblock


macroblock
#	Ù	CTRL + SHIFT + U + 00D9	
	macro			U	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		D
		PRESS		9
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	ù	CTRL + SHIFT + U + 00F9		
	macro			U	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		F
		PRESS		9
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	À	CTRL + SHIFT + U + 00C0	
	macro			A	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		C
		PRESS		0
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	à	CTRL + SHIFT + U + 00E0	
	macro			A	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		0
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	Ç	CTRL + SHIFT + U + 00C7
	macro			C	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		C
		PRESS		7
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	ç	CTRL + SHIFT + U + 00E7
	macro			C	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		7
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	ï	CTRL + SHIFT + U + 00EF
	macro			I	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		F
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	î	CTRL + SHIFT + U + 00EE
	macro			I	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		E
		PRESS		E
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	Ô	CTRL + SHIFT + U + 00D4
	macro			O	ALT	SHIFT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		D
		PRESS		4
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
	
#	ô	CTRL + SHIFT + U + 00F4
	macro			O	ALT
		SET_META	LCTRL
		SET_META	LSHIFT
		PRESS		U
		PRESS		0
		PRESS		0
		PRESS		F
		PRESS		4
		CLEAR_META	LCTRL
		CLEAR_META	LSHIFT
	endmacro
endblock

# reset conditionals in case this file is included from another file
ifset any
ifkeyboard any
ifselect any


