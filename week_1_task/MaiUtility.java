package week_1_task;

import utility.Utility;

public class MaiUtility {

	public class Main {
		public static void main(String[] args) {
			// Calling the static method without creating an object
			int number = 12345;
			int length = Utility.getLength(number);

			// Printing the length of the integer
			System.out.println("The length of the number " + number + " is: " + length);
		}
	}

}
