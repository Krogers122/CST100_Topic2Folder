
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		java.util.Scanner input = new java.util.Scanner(System.in);

	    // Enter an integer
	    System.out.print("Enter an integer: ");
	    int number = input.nextInt();

	    System.out.println("Is " + number + " divisible by 5 and 6? " +
	      ((number % 5 == 0) && (number % 6 == 0)));

	    System.out.println("Is " + number + " divisible by 5 or 6? " +
	      ((number % 5 == 0) || (number % 6 == 0)));

	    System.out.println("Is " + number +
	      " divisible by 5 or 6, but not both? " +
	      ((number % 5 == 0) ^ (number % 6 == 0)));
	  }
	}
