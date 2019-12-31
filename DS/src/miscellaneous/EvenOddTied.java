package miscellaneous;

import java.util.Scanner;

/*You will be given an array and you need to find odd numbers and add them, find even numbers and add them. Then compare the result, if the sum of even numbers found to be greater then print 'Even' to the stdout, if sum of odd number is greater than print 'odd' to the stdout. If sum of both found to be equal, then print 'Tied' to the stdout.

Input Format
You will be taking a number as an input stdin which tells about the length of the array. On another line, array elements should be there with single space between them.

Output Format
You need to print 'Even', 'Odd' or 'Tied' according to the sum of odd and even numbers.*/

public class EvenOddTied {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();

		int[] numbers = new int[length];

		for (int i = 0; i < length; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.print(getResult(numbers, length));
	}

	public static String getResult(int[] arr, int length) {
		int even = 0;
		int odd = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}

		if (even > odd) {
			return "Even";
		} else if (even < odd) {
			return "Odd";
		} else {
			return "Tied";
		}
	}
}
