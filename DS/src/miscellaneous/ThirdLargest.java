package miscellaneous;

import java.util.Scanner;

public class ThirdLargest {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] input = new int[length];

		for (int i = 0; i < length; i++) {
			int userInput = sc.nextInt();
			input[i] = userInput;
		}
		sc.close();
		System.out.println(getResult(input, length));
	}

	public static int getResult(int[] arr, int length) {
		int h1 = 0, h2 = 0, h3 = 0 , temp = 0 ,temp2 = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] > h1) {
				temp = h1;
				h1 = arr[i];				
				if (temp > h2) {
				  temp2 = h2 ;
				  h2 = temp;
				  temp = temp2;
				  if(temp > h3){
					  h3=temp;
				  }
				}
				else if (temp>h3){
					h3=temp;
				}
								
			} else if ((arr[i] < h1) && (arr[i] > h2)) {
				if (h2 > h3) {
					h3 = h2;
				}
				h2 = arr[i];
			} else if ((arr[i] < h2) && (arr[i] > h3)) {
				h3 = arr[i];
			}
		}
		return h3;

	}
}
