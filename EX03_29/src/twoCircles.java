import java.util.Scanner;

public class twoCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
		  
		  System.out
		    .print("Enter circle 1's center x-, y-coordinates, and radius:");
		  double x1 = input.nextDouble();
		  double y1 = input.nextDouble();
		  double r1 = input.nextDouble();
		 
		  System.out
		    .print("Enter circle 1's center x-, y-coordinates, and radius:");
		  double x2 = input.nextDouble();
		  double y2 = input.nextDouble();
		  double r2 = input.nextDouble();
		 
		  double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		 
		  if (d <= Math.abs(r2 - r1)) {
		   if (r1 > r2) {
		    System.out.print("circle 2 is inside circle1");
		   } else if (r2 > r1) {
		    System.out.print("circle 1 is inside circle2");
		   } else {
		    System.out.print("circle 2 is indentical to circle1");
		   }
		  } else if (d < r2 + r1) {
		   System.out.print("circle 2 overlaps circle 1 ");
		  } else if (d >= r2 + r1) {
		   System.out.print("circle 2 does not overlaps circle 1 ");
		  }
		 
		 }
		}