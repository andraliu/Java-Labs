/**
 * @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72

 *
 * @author
 * @version
 */

/*
 * Programmed by: Andra Liu
 * Date: 11/7/18
 * Description: This program converts between dog years and human years
 * Period: 5
 * Version: 1
*/

import java.util.Scanner; //import statement

public class DogYears2 { //dog years class
	double humanDouble; //creates double and int for rounding
	int humanInt;
	double dogDouble;
	int dogInt;

    public int convertToHumanYears(int dog) { //convert dog years to human years
    	if(dog == 0) { //if dog is 0 years old
    		humanDouble = 0;
    	}
    	
    	if(dog == 1) { //if dog is 1 year old
    		humanDouble = dog + 12;
    	}
    	
    	if(dog > 1) { //if dog is older than 1 year old
    		humanDouble = (double)13 + (double)1/(double)2 + ((double)dog - (double)1) * ((double)16/(double)3);
    	}
    	humanInt = (int)humanDouble; //casting double to int
    	return humanInt; //returns humanInt valaue
    }

    public int convertToDogYears(int humanInt) { //converts human years to dog years
    	if(humanInt <= 13) { //if human is less than or equal to 13 years old
    		dogDouble = 0;
    	}
    	
    	if(humanInt == 13) { //if human is 13 years old
    		dogDouble = 1;
    	}
    	
    	if(humanInt >= 13) { //if human is older than 13 years
    		dogDouble = (double)1 + (double)0.5 + ((double)humanInt - (double)12) * ((double)3/(double)16);
    	}
    	dogInt = (int)dogDouble; //casting to int
    	return dogInt; //returns dogInt value
    }

	public static void main(String args[]) { //main string
		Scanner keyboard = new Scanner(System.in); //allows user to input information
		System.out.print("Enter a dog's age: ");
		int dog = keyboard.nextInt(); //dog equals the user's input
		DogYears2 converter = new DogYears2();
		int humanInt = converter.convertToHumanYears(dog); //converts dog years to human years
		System.out.println("Here is the dog's human age: " + humanInt);	//output
		
		System.out.print("Enter a human's age: "); //user inputs information
		humanInt = keyboard.nextInt(); //humanInt equals user input
		DogYears2 converter2 = new DogYears2();
		int dogInt = converter2.convertToDogYears(humanInt); //converts human years to dog years
		System.out.println("Here is the human's dog age: " + dogInt); //output
		
		/*
		//tells how old you are
		System.out.print("Enter the year you were born in: ");
		int birthYear = keyboard.nextInt();
		birthYear = 2018 - birthYear;
		System.out.print("You are " + birthYear + " years old!");
		*/
	}

}