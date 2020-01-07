package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = { 6, 4, 8, 9, 1, 24, 78, 25 };
		sortBubble(myArray);
	}

	public static void sortBubble(int[] arr) {
		
		int arrLength = arr.length;
		int temp = 0;
		for (int i = 0; i < arrLength-1 ; i++) {
			for (int j = 0; j < arrLength-i-1; j++) {
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
