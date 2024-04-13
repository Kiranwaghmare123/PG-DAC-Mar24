Date: 02/04/2024
--------------------------------------------
ADS Day 1: Introduction to Data Structures
--------------------------------------------
# Topic: 
	-Algorithms
	-Data structures
	-Need of data structures
	
# Computational Thinking: 
    - It is a problem solving process that includes:
    	-Decomposition
    		-breaking down data, process or problem into smaller  and managable parts
    	-Pattern Recognition
    		-observing pattern, trends, or regularities in data
    	-Abstraction
    		-hiding the important details and providing overview to solve a problem
    	-Algorithm design
    		-developing a step by step strategy for solving the problem
    		
# Algorithm:

	-It is asequence of unambiguous instructions for solving problem  for desired output in limited amount of time.

# Characteristics of an Algorithm:

	-Input: 
		atleast must have one single input.
	-Output: 
		atleast must have one single output.
	-Unambiguity:
		the instructions in an alorithm should be clear and simeple.
	-Finiteness:
		algorithm need to be finite.(limitation to the instruction)
	-Effectivenes:
		algorithm must be effective at each instruction.
	-Language independent:
		algorithm can be implemented in any programming language.

Advantage of Algorithm:
------------------------
	-Scalability:
	-Performance:
	
	-Good algorithm:
		-Running time
		-Space used

# Algorithm Strategies:

    1. Brute force
    2. Divide and Conquer
    3. Decrease and conquer
    4. Tranform and conquer
    5. Greedy approach
    6. Dynamic programming
    7. Backtracking
    8. Recursion

# Good algorithm:

		
	-Better data structures
	-Better algorithms
	-Better optimal algorithm strategies.
	-Better scalability
	-Better time or space efficiency
	
# Data structure:
----------------
	-A data structure is a data organization, management and storage format that enables efficient access and modification.
	-specilized format to organize information.
	-Program = Algorithms + Data structures
	
# Types of Data structure:
------------------------
	-Linear :
	
		-Elements are arranged in one dimension, also known as linear dimension.
		-Array, stack, list, queue etc ...
	-Non Linear :
		-Elements are arranged in one to many and many to many dimension.
		-Tree, heap, graph,..
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/6115ca94-f910-462d-9b8c-ee87068b8075)
		
# Home Work: 
	1.Differentiate between primitive and non primitive
	2.Differentiate between Linear and non linear
	
# Keywords:


    Keywords: Meaning
    ------------------
    linear : in sequence
    non-linear : not in sequence
    homogenous :similar type
    non- homogenous : not similar
    static : fixed size
    dynamic : variable size
    efficient
    reusability:

# ADT:Abstract Data Structure:

	-ADT is a type  or class for object whose behaviour is defined in the program.
	-perform the operations but implementations are inbuilt in nature.
	-does not specify how data will be organized in memory.
	-called as "abstract" because it give an implementation-independent view
	-The process of providing only the essentials and hiding the details is known as abstraction.
![image](https://github.com/Kiranwaghmare123/PG-DAC-Mar24/assets/72081819/b05caefe-bcb7-4d74-aba1-24c2fabce1f4)

# Recursion:

	-Any function which calls itself directly or indirectly is called recursion.
	- a recursive method solves a problem by calling a copy of itself to work on smaller problem.
	-TOH,Tree traversals, DFS,BS,Merge sort, Quick sort.


# Ex: Direct REcursion:

	void recursion()
	{
		.....
		recursion()
	}


	int main()
	{
	....
	recursion()
	}

# Ex: Indirect REcursion:

	int rec1()
	{
	..
	rec2()
	}
	int rec2()
	{
	...
	rec1()
	}
	int main()
	{
	 rec1()
	}

# Homework:
### Day 1 : Special Logic Building Assignment: 100 special Programs

	1. Write a Java Program to find GCD of two given numbers. 
	2. Write a java program to LCM of TWO given number. 
	3. Write a Java Program to print all the Prime Factorsof the Given Number. 
	4. Check whether the Given Numberis a Palindrome or NOT. 
	5. Write a Java Program to check whether the Given Number is Prime Number or NOT. 
	6. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 
	7. Write a Java Program to check whether the given number is Perfect Numberor NOT. 
	8.  Write a Java Program to check whether the given numbers are Amicable Numbersor NOT.
	9. Write a Java Program to check whether the given number is Ramanujam's Numberor NOT.
	10. Write a Java Program check whether the given number is Automorphic Numberor NOT.

----------------------------------------------------------
### Day 2 : Special Logic Building Assignment: 10 special Recursion Programs

	1. Print 1 to n without using loops
	2. Sum of natural numbers using recursion
	3. Mean of Array using Recursion
	3. Sum of array elements using recursion
	4. Decimal to binary number using recursion
	5. Sum of digit of a number using recursion
	6. Print reverse of a string using recursion
	7. Program for length of a string using recursion
	8. Tail recursion to calculate sum of array elements.
	9. Recursive function to check if a string is palindrome
	10. Print Fibonacci Series in reverse order using Recursion


----------------------------------------------------------
### Day 3 :  100 Special Programs Series: Linked list

	1.Implement singly linked list in java
	2.Implement Doubly linked list in java
	3.How to reverse a linked list in java
	4.How to merge two linked list in sorted order in java
	5.How to find middle element of linked list in java
	6.How to detect a loop in linked list in java
	7.Find start node of loop in linkedlist
	8.How to find nth element from end of linked list
	9.How to check if linked list is palindrome in java
	10.Add two numbers represented by linked list in java

----------------------------------------------------------
### Day 4 :  100 Special Programs Series: Doubly linked list & Tree

	1.Doubly Linked List Insertion in java
	2.Reverse a Doubly Linked List in java
	3.Delete a node in a Doubly Linked List in java
	4.Program to find length of Doubly Linked List in java
	5.Find the largest node in Doubly linked list in java
	6.Insert value in sorted way in a sorted doubly linked list in java
	7.Write tree traversals in java
	8.Search a node in Binary Tree
	9.Inorder Successor of a node in Binary Tree
	10.Print Head node of every node in Binary Tree


----------------------------------------------------------
### Day 5 :  100 Special Programs Series: Linked list


	1. Bubble Sort 
	2. Quick Sort 
	3. Selection Sort 
	4. Insertion Sort 
	5. Merge Sort 
	6. Quick Sort
	7. Sorting Strings using Bubble Sort
	9. Bubble Sort for Linked List by Swapping nodes
	10.Bubble Sort On Doubly Linked List

----------------------------------------------------------
### Day 6 :  100 Special Programs Series: Searching

	1. Linear Search 
	2. Binary Search 
	3. Sort elements by frequency
	4. Sort an array of 0s, 1s and 2s
	5. Java Program to Check for balanced parenthesis by using Stacks
	6. Java Program to Implement Stack
	7. Java Program to Implement Queue
	8. Java Program to Implement Dequeue
	9. Java Program to Implement Stack Using Two Queues
	10.Java Program to Implement Queue Using Two Stacks



