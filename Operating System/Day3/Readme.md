
# Day 3:Process
	-Process, life cycle
	-Preemptive and non preemptive  process
	-Schedulers, types of schedulers
	-Scheduling Algorithms
	-child process, fork, Orphan and zombie 
	
	
	
# Contex Switching:
------------------
    when CPU switches to another process, the system must save the state of the old process and load the saved state for the new process via context switching.


# Operations on Process:
----------------------
    1. Process Creation
    -The process which creates other process, is terminated the parent of the other process, while the created sub-process is termed its child
    	-fork() or spawn()
    	
    2. Process Termination
          	-exit()
          	-wait()
          	-abort()

# Types of Process:
-------------------
    ### 1. Daemon:
    -System process that exist for a specific system purpose.
    -httpd daemon -exits for the sole purpose of handling of internet servecies, running inactive in the background until needed.
    
    ### 2.Parent:
    -A process which has spawned another process.
    -boot-up: a process called init is invoked
    
    ### 3.Child:
    -process fork() by another process
    -Except for initi all other processes are a child processe of a parent process.
    
    ### Orphan: 
    -Created when a child process is running and the parent process is killed.
    
    ### Zombie:
    -Created when a child process loses it's connection to an existing parental proess.

# CPU scheduling:
------------------
    1. Maximum CPU utilization
    2. CPU Burst and I/O Burst 
    - Process execution consist of a cycle of CPU execution and I/O wait.
    3.CPU burst distribution (Eficiently)

# Dispatcher:
--------------
    -It gives control of the CPU to the process selected by the short term scheduler.
    -It involves:
    	-contex switching
    	-switching to the user mode
    	-jumping to the program location in the user mode to restart that program.
    
    Dispatch latency: 
    -----------------
    -time it takes for the dispatcher to stop one process and start another process.

# Scheduling Criteria:
---------------------
    1.CPU utilization
    -keep the CPU as busy as possible.
    
    2.Throughput
    -number of processes that complete their execution per time unit
    
    3.Turnaround time
    -amount of time to execute a particular process.
    
    4.Waiting time
    -amount of time a process has been waiting in the ready queue.
    
    5.Response time
    -amount of time it takes from when a request was submitted until the first response is produced.
    
    
    Other terminology:
    ------------------
    Arrival time: 
    Time at which process enter the ready queue/ready state.
    
    Burst time: 
    Time required by a process to get executed by CPU.
    
    Completion time:
    Time at which process complete its execution.
    
    Turn around time: 
    {Completion time - Arrival time}
    
    Waiting time: 
    {Turn around time - Burst time}
    
    Response time:
    {Time at which a processor get CPU - Arrival time}

# Scheduling Algorithm:
----------------------

    Convey Effect:
    
    -It is nothing but the situation where many processes, who need resources for short time are blocked by one big process by holding those resources for a long time.
