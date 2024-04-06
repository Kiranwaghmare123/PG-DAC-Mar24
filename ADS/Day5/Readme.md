
# Analysis of Algorithm:

#### Algorithm:
    	-Design
    	-Domain knowledge
    	-Language
    	-Hardware, OS
    	-Analysis


#### Program:
    	-Implement
    	-Programmer
    	-Programming language
    	-Hardware, OS
    	-Testing
    	
# Characteristic of Algorithm:

    * Input - 0/more input
    * Output -atleast one output
    * finite
    * unambiguity
    * effective

# AoA : Algorithm complexity
---------------------------
    1. Time factor:
    	-Time is measured by counting the number of key operations such as comparisions in the algorithms (sorting/searching)
    	-Time complexity
    	
    2. Space factor:
    	-Space is measured by counting the maximum memory space required by the algorithms.
    	-Space complaxity
    	
# Asymptotic Notations:

    -Asymptoic notation of an algorithm refers to defining the mathematical boundations of its run-time performance. Using asymptotic analysis, we can conclude, best case, average case and worst case scenario of the algorithm 

    	1. Best case: Minimum time required for program execution.
    	2. Worst case: Maximum time required for program execution
    	3. Average case: Average time required for program execution.

# Asymptotic Notation
    Through asymptotic notation, we can calculate a program’s runtime by looking at how many instructions the computer has to perform based on the size of the program’s input: N.
    
    For asymptotic notation, we drop all of our constants (the numbers) because as N becomes extremely large, the constants will make minute differences.
    Ex: 3n+2 becomes (n).
    
    There are _three_ different ways we could describe the runtime of a program: 
    1. **Big Theta - Θ(N)** 
    2. **Big O - O(N)**
    3. **Big Omega - Ω(N)**

## Big Theta (Θ)
We use big Theta when a program has only one case in term of runtime.

    Big theta is either the exact performance value of the algorithm, or a useful range between narrow upper and lower bounds.
    
    **Examples:**
    * “I can pay you at least one dollar.” (big-omega, lower bound)
    * “The high today will be 25ºC, and the low will be 19ºC.” (big-theta, narrow)
    * “It’s a kilometer walk to the beach.” (big-theta, exact)
    * “The delivery will be there within your lifetime.” (big-O, upper-bound)

    _Examples taken from freecodecamp._

    ## Common Runtimes
    * **Θ(1):** This is constant runtime. This is the runtime when a program will always do the same thing regardless of the input. 
    * **Θ(log N):** This is logarithmic runtime. Often seen in search algorithms.
    * **Θ(N):** This is linear runtime. Often seen when iterative through an entire list or for example an array.
    * **Θ(NlogN):** Often seen in sorting algorithms.
    * **Θ(N2):** This is an example of a polynomial runtime. Often seen when you have to search through things like matrix or nested loops.
    * **Θ(2N):** This is exponential runtime. Often seen in recursive algorithms.
    * **Θ(N!):** This is factorial runtime. Often seen when generating all the different permutations of something.

## Big Omega (Ω) And Big O (O)
    We use big Omega or Ω to describe the best case and big O or O to describe the worst case.
    
    When describing runtime, people typically discuss the worst case.
    
    Let’s take a list of size 100. If the first value in the list was 10, then the loop would only iterate once. 
    
    However, if 10 wasn’t in the list at all, the loop would iterate 100 times. 
    
    If the input was a list of size N, the loop could iterate anywhere from 1 to N times depending on where 10 is in the list. 
    
    Thus, in the best case, it has a constant runtime and in the worst case it has a linear runtime.
    
    There are many ways we could describe the runtime of this program:
    
    1. This program has a best case runtime of Θ(1).
    2. This program has a worst case runtime of Θ(N).
    3. This program has a runtime of Ω(1).
    4. This program has a runtime O(N).
    
## Adding Runtimes
    Let us consider there are two for loops.
    
    In the first loop, we iterate until we reach N. Thus the runtime of the first loop is Θ(N).
    The second loop, runs in Θ(log N).
    
    We can now add both of them, so now the runtime becomes Θ(N) + Θ(log N).
    
    When analyzing the runtime of a program, we only care about the slowest part of the program, and because Θ(N) is slower than Θ(log N), we would actually just say the runtime of this program is Θ(N). 
    
    It is also appropriate to say the runtime is O(N) because if it runs in Θ(N) for every case, then it also runs in Θ(N) for the worst case.

## Summary

    * We use asymptotic notation to describe the runtime of a program. The three types of asymptotic notation are big Theta, big Omega, and big O.
    * We use big Theta (Θ) to describe the runtime if the runtime of the program is the same in every case.
    * The different common runtimes from fastest to slowest are: Θ(1), Θ(log N), Θ(N), Θ(N log N), Θ(N2), Θ(2N), Θ(N!).
    * We use big Omega (Ω) to describe the best-case running time of a program.
    * We use big O (O) to describe the worst-case running time of a program.
    * We typically describe a program’s running time in terms of big O.
    * When finding the runtime of a program with multiple steps, you can divide the program into different sections and add the runtimes of the various sections. You can then take the slowest runtime and use that runtime to describe the entire program.
    * When analyzing the runtime of a program, we care about which part of the program is the slowest.
      # Order of Time complexity:

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/ea3e7028-27ed-42ff-9e84-d4bc2bd7bb41)


      O(1) < O( log(n) ) < O(n) < O( n log(n) ) < O ( n2 ) < O ( 2n ) < O ( n!)

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/45f8db52-84e3-4c47-bf40-c05066b00d93)

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/3e53a827-3333-4192-ac7b-2cc0373b7351)

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/fa336cc4-8c63-4d50-b27c-f6f15963dffc)

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/4b61fe58-56bb-45cc-ab0f-96aef6cb8d06)

  ![image](https://github.com/Kiranwaghmare123/PG-DAC-Sep23/assets/72081819/5479bda2-4c55-417b-82fe-6284ba10f120)




