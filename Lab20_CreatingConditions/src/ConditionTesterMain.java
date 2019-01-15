//main class

/*
 * 1. experiment
 * 2. comment for all methods that describe function
 * 3. name header + period
 */

import java.util.Scanner;

public class ConditionTesterMain { //main method
	public static void main(String[] args) {
		ConditionTester tester1 = new ConditionTester();
		
		Scanner kboard = new Scanner(System.in);
		
		//prompts user to choose which tester they want to run
		System.out.println("1. Checks if point (x,y) is inside a given rectangle");
		System.out.println("2. Checks if a year is a leap year");
		System.out.println("3. Checks if an integer ends in exactly 2 zeros");
		System.out.println("4. Checks if a date is later than another date");
		System.out.println("5. Calculates cost of Be Prepared and Next Best books");
		System.out.println("");
		System.out.println("Type in the number of the test you want to run --> ");
		int num = kboard.nextInt();
		
		
		if(num == 1) { // creating conditions practice
			System.out.print("Enter the x coordinate of your point --> "); 
			int num1 = kboard.nextInt();

			System.out.print("Enter the y coordinate of your point --> "); 
			int num2 = kboard.nextInt();
		 
			System.out.print("Enter the x coordinate of your rectangle --> "); 
			int num3 = kboard.nextInt();
			
			System.out.print("Enter the y coordinate of your rectangle --> "); 
			int num4 = kboard.nextInt();
			
			System.out.print("Enter the width of your rectangle --> "); 
			int num5 = kboard.nextInt();
			
			System.out.print("Enter the height of your rectangle --> "); 
			int num6 = kboard.nextInt();
			
			boolean result1 = tester1.isPointInRectangle(num1, num2, num3, num4, num5, num6);
			
			// Printing out the result of the test!
			System.out.println("The result of the test: " + result1);
			
		} else if(num == 2) { //creating conditions 1
			System.out.print("Enter the year --> "); 
			int num1 = kboard.nextInt();
			
			boolean result2 = tester1.isLeapYear(num1);
			System.out.println("The result of the test: " + result2);
			
		} else if(num == 3) { //creating conditions 2
			System.out.print("Enter your number --> "); 
			int num1 = kboard.nextInt();
			
			boolean result3 = tester1.hasTwoEndingZeros(num1);
			System.out.println("The result of the test: " + result3);
			
		} else if(num == 4) { //creating conditions 3
			System.out.print("Enter your first month --> "); 
			int num1 = kboard.nextInt();
			
			System.out.print("Enter your first day --> "); 
			int num2 = kboard.nextInt();
			
			System.out.print("Enter your first year --> "); 
			int num3 = kboard.nextInt();
			
			System.out.print("Enter your second month --> ");
			int num4 = kboard.nextInt();
			
			System.out.print("Enter your second day --> ");
			int num5 = kboard.nextInt();
			
			System.out.print("Enter your second year --> ");
			int num6 = kboard.nextInt();
			
			boolean result4 = tester1.isLater(num1, num2, num3, num4, num5, num6);
			System.out.println("The result of the test: " + result4);
			
		} else { //problem #15 in the textbook
			System.out.println("Enter the number of Be Prepared books you would like to purchase --> ");
			int num1 = kboard.nextInt();
			
			System.out.println("Enter the number of Next Best books you would like to purchase --> ");
			int num2 = kboard.nextInt();
			
			double result5 = tester1.getOrderTotal(num1, num2);
			System.out.println("Your total is: $" + result5);
			
		}
	}
}
