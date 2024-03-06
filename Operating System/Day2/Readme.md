--------------------------------------------------------------	
Date: 04/03/2024
# Day 2: Linux Commands & Process Management
--------------------------------------------------------------
	-Basic Linux Commands
	-File permissions
	-Vi editor
	-Shell Programming
 # Day 2:Process
	-Process, life cycle
	-Preemptive and non preemptive  process
	-Schedulers, types of schedulers

# Linux Commands:
---------------	
	man : to take help	
	man ls:
	
	ls:To list the files
	
		-a		
		-l		
		-d		
		-c		
		-S		
		-h

	cd : change directory
	
		cd dir_name		
		cd ~		
		cd ..
		cd ../ ../		
		cd - 

	pwd:working directory

	cp : copy the content of file	
		-cp -i(iteractive)		
		-cp -r <source> <destination>
	mkdir

	rm
	rm -rf
	mv <old> <new>	
	rm filename	
	rm file1 file2 file3	
	rm -i

	cat file1 	
	cat > file	
	cat >> file

	head [-n] file	
	head -2 x2.txt
	tail -2 x2.txt

	grep

	sort file	
	sort -r file	
	sort -ru file

	Regular Expressions:
	----------------------

		. 	character
		[]	match any character listed in the brackets		
		[^ ]	match any character not listed in the brackets		
		^	matches in the begining of the line		
		$	matches in the end of the line		
		*	match with anything

	man	
	-h	
	-help
	

# Home directory:
	-The directory where user login is present
	
# Working directory:
	-can access files in our working directory
	
#Path: 
-----
### Absolute path:
    -The total path leading to the directory

### Relative path:
    -The path relative to the working directory

    .: current directory
    ..:parent directory

# Meta character : wild card
---------------------------
    ?, *, [], - (Range)
    file *
# File permission:
-----------------
    Read : r
    Write: w
    Execute: x
    ----------
    other Users: r,w,x
    Owner/user: r,w,x
    Group: r,w,x


# Symbolic mode: Permissions:
--------------------------------
	+ : Adding permission
	- : Removing permission

# Absolute mode:Permissions:
-------------------------------
	1 : Adding permission
	0 : Removing permission
	
# command : chmod
# Shell:
------
    -Bourne shell
    -C shell
    -Korn shell
    -Born again shell(bash)

# Editor:
--------
    In 1970: Editor concept
    ASCII=> Text file=>Flat files
    QED: Quick editor
    FRED: Friendly Editor
    ED: Standard Editior
    EX: Extended Editor

    Now a days,
    -vi editor
    -nano editor
----------------------------------------------------
# Day 2:Process Management
	-Process, life cycle
	-Preemptive and non preemptive  process
	-Schedulers, types of schedulers

# Process:
----------
-basically it is an instance of the computer program that is being executed.
-life time of process is very small or short
-requires resources cpu, memory, I/o devices
-running instance

# Program:
---------
-basically a collection of instructions that mainly performs a specific task when executed by the computer.
-life time of program is longer duration
-stored on drive
-executable code


# Process in Memory:
-------------------
    Text: compiled program, read, write inputs....
    
    Data: made up of global variables, static varible,....
    
    Heap: dynamic memory allocation  and it is managed by system call...
    
    Stack: local variable 

    
    Process:  a program in execution;
    -process execution must progress in sequential fashion.
    
    -Batch system : executes in group (Jobs)
    -Time sharing system : user program  or task : (time slice)
    
    -Every process includes:
    	-Program counter 
    	-stack
    	-data section
    	
# Life cycle of Process : Every process has state: 
  	-New : newly being created
  	-Running : being executed
  	-Waiting : waiting for CPU, I/O...
  	-Ready : waiting for gettig assign
  	-Terminated :task is finished
  	
    -For process PCB (Process Control Block)

# Process scheduling:
-------------------
    The act of determining which process in the ready state and 
    schedule it to the running state, it is known as 
    Process scheduling.

# Types of process:
-----------------
### 1. Non-preemptive scheduling:
    -when the currently executing process gives up the CPU voluntarily.

### 2. Pre-emptive scheduling:
    -when the OS decides to favour another process, pre-empting the 
    currently executing process.

# Queue:
------
    1. Job queue : set of all processes in the system
    2. Ready queue : set of all processes residing in main memory, ready and waiting to execute.
    3. Device queue : set of processes waiitng for an I/O device.

# Types of Scheduler:
-------------------
    1. Long term Scheduler or Job scheduler
    -selects which preocess should be brought into the ready queue.
    -It takes process from the job pool
    
    2. Short term Scheduler or CPU scheduler
    -selects which process should be executed next and allocates CPU.
    -It takes process from the ready queue
    
    3. Medium term Scheduler
    -select which process should be brough into the device queue.
    -It is a process swapping out from the scheduler/CPU
