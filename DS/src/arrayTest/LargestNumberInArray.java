package arrayTest;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int arrayLength, maxValue;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide number of element in an array");
		arrayLength = scanner.nextInt();
		int[] array = new int[arrayLength];
		System.out.println("please provide elements of array");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		maxValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		System.out.println("maxValue in Array is :" + maxValue);
	}
}
