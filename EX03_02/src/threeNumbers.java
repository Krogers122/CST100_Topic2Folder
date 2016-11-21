import java.util.Scanner;

public class threeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    
	    int number1 = (int)(System.currentTimeMillis() % 10);
	    int number2 = (int)(System.currentTimeMillis() * 7 % 10);
	    int number3 = (int)(System.currentTimeMillis() * 3 % 10);

	    System.out.print("What is " + number1 + " + " + number2 + " + " +
	       number3 + "? ");

	    int answer = input.nextInt();
	    
	    System.out.println(number1 + " + " + number2 + " + " + number3 + 
	      " = " + answer + " is " +
	      (number1 + number2 + number3 == answer));
	  }
	}
