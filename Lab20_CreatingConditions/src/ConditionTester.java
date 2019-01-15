
/*
	This is the ConditionTester template. Use this class to test simple boolean methods!
	Coded by: Andra Liu
	Date: 12/5/18
	I chose to do #15 in the textbook
*/

import java.util.Scanner;

public class ConditionTester { // has all the methods

	// checks if point (x,y) is inside a given rectangle
	public boolean isPointInRectangle(int x, int y, int rectX, int rectY, int rectWidth, int rectHeight) {
		boolean result1;

		if (((x >= rectX) && (x <= (rectX + rectWidth - 1))) && ((y >= rectY) && (y <= (rectY + rectHeight - 1)))) {
			result1 = true;
		} else {
			result1 = false;
		}
		return result1;
	}

	// checks if the year is leap year
	public boolean isLeapYear(int year) {
		boolean result2;

		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			result2 = true;
		} else {
			result2 = false;
		}
		return result2;
	}

	// checks if an integer ends in exactly 2 zeros
	public boolean hasTwoEndingZeros(int x) {
		boolean result3;

		if ((x % 100 == 0) && (x % 1000 != 0)) {
			result3 = true;
		} else {
			result3 = false;
		}
		return result3;
	}

	// checks if a date is later than another date
	public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
		boolean result4;

		if (year1 > year2) { //if first year is larger than second year
			result4 = true;
		} else if (year1 == year2) { //if years are equal
			if (month1 > month2) { //if month one is greater than month two
				result4 = true;
			} else if (month1 == month2) { //if months are equal
				if (day1 > day2) { //if day one is greater than day 2
					result4 = true;
				} else if (day1 == day2) { //if day 1 is equal to day 2
					result4 = false;
				} else { //if day 1 is less than day 2
					result4 = false;
				}
			} else { //if month one is less than month two
				result4 = false;
			}
		} else { //if first year is less than second year
			result4 = false;
		}
		
		return result4; //returns result
	}

	// calculates cost of Be Prepared and Next Best books
	public static double getOrderTotal(int bp, int nb) {
		double result5 = 0;

		if (bp == 1) { // if only one best prepared book
			result5 = 18.95;
		}

		if (nb == 1) { // if only one next best book
			result5 = 21.95;
		}

		if ((bp == 1) && (nb == 1)) { // if 1 of next best and 1 of be prepared
			result5 = 37.95;
		}

		if ((nb + bp) >= 3) { // if bought 3 books or more
			result5 = (nb + bp) * 15.95;

			// rounding double to two decimal places
			result5 = result5 * 100;
			int result6 = (int) (result5 + 0.5);
			double extra = result5 - result6;
			result5 = result5 - extra;
			result5 = result5 / 100;
		}

		if ((nb + bp) >= 12) { // if bought 12 books or more
			result5 = (nb + bp) * 14.00;

			// rounding double to two decimal places
			result5 = result5 * 100;
			int result6 = (int) (result5 + 0.5);
			double extra = result5 - result6;
			result5 = result5 - extra;
			result5 = result5 / 100;
		}

		return result5; // returns result
	}

}