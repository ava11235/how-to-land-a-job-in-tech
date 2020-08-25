## Big O Complexity  is used to classify algorithms based on how resources (space and time ) requirements grow depending on the size of the input.

### To determine an alogoritmn’s Big O complexity, we stipulate the following:
1. Every statement takes the same amount of time to run
2. To measure the run time of a method, add up the sum of the statements that are part of this method. 
3. To measure the Big O of a loop, multiply the number of statements in the loop times how many times the loop runs e. g. 5 X N
5. The Big O complexity of a nested loop is  O(N^2)


The highest order term determines the Big O. For example, if we have
N^2 + 5N + 35, the Big O complexity would be N^2
Divide and conquer approach algorithms such as binary search have a complexity of O(Log 2 N)
 

### Big O Complexity Classes and how Big O is affected by changing (in this example doubling), th value of N:

1. O(1) Constant. Time not dependent on N
2. O(log2 N) Logarithmic.  Time increasse in a logarithmic fashion
3. O(N) Linear.  Time increases linearly as N increases
4. O(N^2) Quadratic. Time quadruples as N doubles  as N doubles
5. O(N^3) Cubic. Time multiplied by 8
6. O(2^N) Exponential. Time increases by A LOT.

### Example: 

What is the Big O Complexity class  of the following method: 

public static void replaceListItems int [] list){

  for (int i = 0; i <= list.lenght; i++){
	  list[i] = list[i *3];
	  list[i+1]= list[i ^2]
  }
}
### Answer:
O(N):  2 statements = 2 * N (number of times the loop will run)


### Common Data Structures	Complexity classes (worst times*) 
                          Access Search Insertion Deletion	
Array	                    O(1)	  O(n)	O(n)	    O(n)	
Stack	                    O(n)	  O(n)	O(1)	    O(1)	
Queue	                    O(n)	  O(n)	O(1)	    O(1)	
Singly-Linked List      	O(n)	  O(1)	O(1)	    O(n)
Doubly-Linked List	      O(n)	  O(1)	O(1)	    O(n)
Hash Table	              O(n)	  O(n)	O(n)	    O(n)
Binary Search Tree	      O(n)	  O(n)	O(n)	    O(n)


### Common Sorting algorithms Complexity classes (worst times*)

Algorithm     Time Complexity

Quicksort     O(n^2)

Mergesort     O(n log(n))

Bubble Sort   O(n^2)

Insertion Sort O(n^2)

Selection Sort O(n^2)

* While we can measure best or average times, we are usually concerned with worst running times 
