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
		
Home Work: 1.Differentiate between primitive and non primitive
	1.Differentiate between Linear and non linear
	
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

