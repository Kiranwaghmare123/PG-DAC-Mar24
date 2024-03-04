# Introduction to Operating System

  Intermediate between Hardware and Software applications
  Hides hardware complexity (Read/write file storage, send/receive socket network)
  Handles resource management (CPU scheduling, Memory management)
  Provide isolation and protection (allocate different parts of memory to different applications so that applications don't overwrite other memory locations)
  
# Operating System definition:
  An Operating System is a layer of systems software that:
  
    -directly has privileged access to the underlying hardware;
    -hides the hardware complexity;
    -manages hardware on behalf of one or more applications according to some predefined policies.
    -In addition, it ensures that applications are isolated and protected from one another.

# Basics of OS:

# Kernel:
 - The kernel is a computer program that is the core of the computer's operating system with complete control over everythig in the system.
 
# System Boot:
  -Boostrap loader: locates the kernel, loads it into memory and start it.

  -Booting system, Bootstrap program.

  -EPROM or ROM memory 

# Types of Operating System:

## 1. Sigle Processor System
  -One main CPU capable of executing a general purpose instruction set including instructions from user processor

## 2. Multiprocessor System
  -prallel system or tightly coupled system
  -2/more processors in close communiucation, sharing the computer bus and somtimes the clock, memory and peripheral devices.

## 3. Clustered System
	-Client-Server system
	-Peer to peer system
	
# OS operation:
  ### Interrupt
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/f1768fc0-e286-4910-bb20-7ea10aeafdb6)

  ### Kernel and User mode : Dual mode
  	-Kernel mode: handle hardware opration
  	-USer mode: handle application software
  	-Mode bit: undersatand by Kernel mode
   ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/2dedf263-55f1-4d0c-a075-2c17ad3eaae8)

  	
# Introduction to Linux:
    -Unix, Windows and Linux

# Windows:
  -User friendly
  -GUI: Graphical User Interface
  -Additional cost for software
  -No distributions
  -Not customizable
  -Admin
  -OS
  -Folders
  -Software
  -\(Backward Slash)
  -Filesystem : FAT,ISO ,UDF,HFS
  -Developed by Microsoft

# Linux:
  -Open source
  -free installation
  -CLI: Command Line Interface
  -Lot of distributions
  -Customizable features
  -Root user
  -Kernel
  -Directory
  -Packages
  -/(Forward Slash)
  -File system : in root users subfolder
  -Developed by Linus Torvalds : (UNIX OS) (1991)
  -fully customizable
  -stable
  -better security structure
  -high portable

# Linux Distribution:
	-Ubuntu : easy to user
	-Linux mint
	-Debian : stability
	-CentOS : trademark
	-Fedora : Application
	-RedHat : commercial
-UNIX architure:

# Powerful features of Unix:
  -Security: private and shared files
  -Multi-user support
  -Inter process communication
  -Extensive network support
  -data transmission to I/O devices
  -STABILITY: 
  -Example: Critical applications
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/bc97f90e-5d07-4886-8c36-5a28e04be33d)

# Kernel: 
  -heart of OS
  -the low level core of the system that is the interface between user application and hardwre.
  -Function:
  	Mange memory
  	Manage I/O devices
  	Allocate the time between user and process
  	Interprocess communication
  	Setting the priority for process


# Shell:
  -The shell program that sits on the interface between user and kernel
  -It is a command interpreter and it has programming capability of its own.

# Shell Types:
  -Bourne shell (First shell by Stephen Bourne)
  -C shell(sh)
  -Korn shell(ksh)
  -Bourne Again Shell (bash)(.sh)

# Bash:
	-CLI : comands : Linux based system
	-command language interpreter and programming language
	-supports variables, functions, flow control,....
	-read, write and execute small command line programs callled as shell script.
	
# Terminal Emulator:
  Username@Hostname : working directory

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/77d4ce5d-c32c-40e8-b2d5-4be0a2a376de)


# Linux Commands:
  -Commands will tell OS to perform set of operations
  -Synatx:
  
  		Command [option] [arguments]
  
  pwd: present working directory
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/bc13f4a7-0f81-4414-bffd-13f4a05e09b0)

  ls: list of files
  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/085ced53-2b17-4cde-9ecf-879c81100818)

# File System:
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/67587887-0e2f-49c8-983b-eba9f7f7f025)

![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/d093ade5-bad5-4a2d-9269-237f64d9a7b4)


File system:
-------------
