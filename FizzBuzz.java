
public class FizzBuzz {

	public static void main(String[] args) {
        fizzBuzz(5);
    }

    public static void fizzBuzz(int number) {
    	
        for ( int i = 0; i < number; i++) {
        
        	if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}