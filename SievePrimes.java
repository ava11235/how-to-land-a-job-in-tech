import java.util.Iterator;
import java.util.LinkedList;

public class SievePrimes {

	public static void main(String[] args) {
	
		System.out.println(primesSieve(10));

	}
	
	public static LinkedList<Integer> primesSieve(int maxNum) {
		
		   LinkedList<Integer> primeNums = new LinkedList<Integer>();
		
		   // create a list to hold numbers from 2 to maxVal
		   LinkedList<Integer> nums = new LinkedList<Integer>();
		   nums.add(2);
		   for (int i = 3; i <= maxNum; i = i + 2) {
		       nums.add(i);
		   }
		  
		   double sqrt = Math.sqrt(maxNum);
		   while (!nums.isEmpty()) {
		       // remove a prime number from the front
		       int front = nums.remove(0);
		       //add to the front of the primes list
		       primeNums.add(front);
		      
		       if (front >= sqrt) {
		           while (!nums.isEmpty()) {
		               primeNums.add(nums.remove(0));
		           }
		       }
		       // if a num is multiple of the prime number, remove it
		       Iterator<Integer> itr = nums.iterator();
		       while (itr.hasNext()) {
		           int current = itr.next();
		           if (current % front == 0) { //multiple of prime
		               itr.remove();
		           }
		       }
		   }
		  
		   return primeNums;
		}



}
