package week1day1;

public class CheckPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Initialize a number, say, int number= 35; 2. If a number is positive,
		 * print "The number is positive" If a number is negative, print
		 * "The number is negative" If it nether negative nor positive, print as
		 * "The number is neither positive nor negative"
		 */

		int input = 35;

		if (input > 0) {

			System.out.println("The input number is postive " + input);
		}

		else if (input < 0) {

			System.out.println("The input number is negative " + input);

		}

		else {

			System.out.println("The number is neither positive nor negative");
		}

	}

}
