Top 50 Linux Commands You Must Know as a Regular User
--------------------------------------------------------
# cal - View a command-line calendar
      cal
      cal May 2019

# date
      date -u
      date +%a
      date +%A
      date +%b
      date +%B
      date +%y
      date +%Y

# ls - The most frequently used command in Linux to list directories
      ls

# pwd - Print working directory command in Linux
      pwd

# cd - Linux command to navigate through directories
      root@ubuntu:~# cd <directory path>
      pwd
      cd /etc/
      pwd

# mkdir - Command used to create directories in Linux
      root@ubuntu:~# mkdir <folder name>
      ls
      mkdir CDAC
      ls

# cp - Similar usage as mv but for copying files in Linux
      root@ubuntu:~# cp <source> <destination>
      ls Demo Demo1

# mv - Move or rename files in Linux
      root@ubuntu:~# mv <source> <destination
      ls
      mv Demo Demo1


# rm - Delete files or directories
        root@ubuntu:~# rm <file name>
        root@ubuntu:~# rm -r <folder/directory name>
        touch test.txt
        ls
        rm test.txt
        ls

# touch - Create blank/empty files
        root@ubuntu:~# touch <file name>
        ls
        touch javanotes
        ls

# ln - Create symbolic links (shortcuts) to other files
        root@ubuntu:~# ln -s <source path> <link name>
        ls
        ls -s CDAC CDAC-Link
        
        #cat - Display file contents on the terminal
        root@ubuntu:~# cat <file name>
        root@ubuntu:~# echo <Text to print on terminal>
        cat t1
        Hello !!!
        echo t1

# clear - Clear the terminal display
# echo - Print any text that follows the command
# less - Linux command to display paged outputs in the terminal
        root@ubuntu:~# cat /boot/grub/grub.cfg  | less

# man - Access manual pages for all Linux commands
        root@ubuntu:~# man <command>

# uname - Linux command to get basic information about the OS
        root@ubuntu:~# uname -a
        uname -about
        whoami

# whoami - Get the active username


# tar - Command to extract and compress files in Linux
        #Compress
        root@ubuntu:~# tar -cvf <archive name> <files seperated by space>
        #Extract
        root@ubuntu:~# tar -xvf <archive name>
        
        root@ubuntu:~# zip <archive name> <file names separated by space>
        root@ubuntu:~# unzip <archive name>

# grep - Search for a string within an output
        root@ubuntu:~# <Any command with output> | grep "<string to find>"
        cat test1
        Hello Learn learn!
        learn.
        cat test1 | greap "learn"

# head - Return the specified number of lines from the top
# tail - Return the specified number of lines from the bottom
          root@ubuntu:~# head <file name>
          root@ubuntu:~# tail <file name>
          head words
          Carrot
          Cave
          Chair
          Chess Board
          Chief
          
          tail words
          Horse
          Hose
          Ice
          Ice-cream
          Insect

# diff - Find the difference between two files
          root@ubuntu:~# diff <file 1> <file 2>
          diff test1 test1edited

# cmp - Allows you to check if two files are identical
          root@ubuntu:~# cmp <file 1> <file 2>
          cmp test1 test1edited

# comm - Combines the functionality of diff and cmp

# sort - Linux command to sort the content of a file while outputting
          root@ubuntu:~# sort <filename>
          cat test1
          sort test1

# export - Export environment variables in Linux
          root@ubuntu:~# export <variable name>=<value>

# zip - Zip files in Linux
# unzip - Unzip files in Linux
# ssh - Secure Shell command in Linux
          root@ubuntu:~ -->> service ssh status
          root@ubuntu:~ -->> service ssh stop
          root@ubuntu:~ -->> service ssh start

# service - Linux command to start and stop services
# ps - Display active processes
# kill and killall - Kill active processes by process ID or name
          root@ubuntu:~ -->> ps 
          root@ubuntu:~ -->> kill <process ID>
          root@ubuntu:~ -->> killall <process name>


# df - Display disk filesystem information
# mount - Mount file systems in Linux
          root@ubuntu:~ -->> mount /dev/cdrom /mnt
          root@ubuntu:~ -->> df -h
          df -h

# chmod - Command to change file permissions
          root@ubuntu:~ -->> chmod +x loop.sh
          root@ubuntu:~ -->> chmod root:root loop.sh

# chown - Command for granting ownership of files or folders
# ifconfig - Display network interfaces and IP addresses
          root@ubuntu:~ -->> ifconfig


# sudo - Command to escalate privileges in Linux

# alias - Create custom shortcuts for your regularly used commands
          root@ubuntu:~# alias lsl="ls -l"
          OR
          root@ubuntu:~# alias rmd="rm -r"

