
	Topics:
		-Shell programming
	
	#!/bin/sh
	or
	#!/bin/bash

	Example:

	#!/bin/bash
	pwd

shell parameter:
------------------

	$1 - $9 : positional parameter
	${10}-${n} : positional parameter can be used as an arguments
	$0 : name of scripting
	$* : all the arguments 
	$@ : (")
	$# : PID of scriptin
	$? : return code


	code: 
	echo "File name: $0"
	echo "File name: $1"
	echo "File name: $2"
	echo "File name: $@"
	echo "File name: $*"
	echo "File name: $#"

	code: 
	#!/bin/bash
	x=2
	y=3
	res=`expr $x*$y`
	echo res

Operators:
-----------
-Arithmetic operator

	-+,-,*,/,%,++,--
	
	code:
	#!/bin/bash
	x=20
	y=10

	((sum=$x+$y))
	echo $sum

	((sub=$x-$y))
	echo "Result= $sub"

	((mul=$x*$y))
	echo "Result= $mul"

	((x++))
	echo "Result= $x"

	((++x))
	echo "Result= $x"

	((y--))
	echo "Result= $y"

	((--y))
	echo "Result= $y"
	
-Relational operator

	>,<,==,!=,>=,<=
	
	-eq : [ $a -eq $b ] is not true
	-ne
	-gt
	-lt
	-ge
	-le

code:

	#!/bin/bash
	x=20
	y=10

	syntax:
	Ex1 :
	if[(( $x==$y ))] then
			echo "same"

	fi

	Ex2 :
	if(( $x==$y )) then
		echo "same"
	else
		echo "different"
	fi

	if(( $x>=$y ))
		echo "same"
	else
		echo "different"
	fi


	if [[ ( $n -gt 10 ) && ( $n%2 -eq 0 ) ]];
	
	((sum=$x+$y))
	echo $sum

	-Logical operator
	
		&&, ||, !

	if(( ![expr `$x==$y`]] ||[ $x=="true" ))
		echo "same"
	else
		echo "different"
	fi


	-Bitwise operator
		-&:bitwise And,
		-|:bitwise Or,
		-^:XOR,
		-~:complement,
		-<<:Left shift,
		->>:Right shift

	code:
	#!/bin/bash
	read   a
	read   b

	echo $(( a&b ))
	or
	bita=$(( a&b ))
	echo $bita

	echo $(( a|b ))

	echo $(( a^b ))

	echo $(( ~a ))
	echo $(( ~b ))

	echo $(( a<<2 ))

	echo $(( a>>1 ))

	conditional statements:
	-----------------------

	-if stmt
	-if-else stmt
	-if-else stmt (If-else ladder)
	-if-else stmt (If-else nesting)
	-switch stmt

	case 1:

	if [ expression ] then
		stmt
	fi
	-----------------------
	case 2:

	if [ expression ] then
		stmt
	else
		stmt
	fi

	-----------------------
	case 3:

	if [ $((sum=$a+$b)) > ] then
		stmt
	elif [ expression 2 ] then
		stmt
	elif [ expression 3 ] then
		stmt
		....
		....
	else
		stmt
	fi

	-----------------------
	case 4:

	if [ expression ] then
		stmt
	else
		if [ expression ] then
			if [ expression ] then
				stmt
			else
				stmt
			fi
		else
			stmt
		fi
	fi

	-----------------------
	case 5:

	case in
		p1) stm1;;
		p2) stm1;;
		p3) stm1;;
		p4) stm1;;
		p5) stm1;;

	esac

	-----------------------
	Loops
		1.while
		2.for
		3.until 

		break
		continue
	case 5:


	for Loop:
	---------
	for a in 4 5 6 7 8 
	do
		if [ $a -eq 7];
		then
			break;
		echo "$a counter"

	done

	for Loop:
	---------
	for a in {0..50}
	do
		if [ $a -eq 7];
		then
			continue;
		echo "$a counter"

	done
	for Loop:
	---------
	for a in 4 5 6 7 8 
	do
		if [ $a -eq 7];
		then
			continue;
		echo "$a counter"

	done

	while Loop:
	------------
	a=1
	while [ $a -lt 10]
	do
		echo $a
		a= `expr $a + 1`
	done



	Until Loop:
	--------------
	read n //500
	n=100;
	until [ $n -gt 5 ]
	do	
		echo $n
		n= `expr $n + 1`
		if [ $a -eq 7];
		then
			continue;
	done


	Function:
	------------
	Hello() {
		echo "Hello "
	}

	Hello


	Hello() {
		echo "Hello $1"
	}

	Hello

Hoemwork :

	Q1. Lucky draw: 
	input : 15 tp 45: Win otherwise lost.

	Q2 number: identify biggest number
	 read input user for 3 values and print big number.
