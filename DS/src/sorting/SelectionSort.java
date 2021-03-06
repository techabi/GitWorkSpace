package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray = {6,4,8,9,1,24,78,25};
		sort(myArray);
	}

	public static void sort(int[] arr) {

		int myLength = arr.length;

		for (int i = 0; i < myLength-1; i++) {
			int index_of_min_val = i;

			for (int j = i + 1; j < myLength; j++) {
				if (arr[j] < arr[index_of_min_val]) {
					index_of_min_val = j;
				}
				int temp = arr[i];
				arr[i] = arr[index_of_min_val];
				arr[index_of_min_val] = temp;
			}

		}
		for (int i = 0; i < myLength; i++) {
			System.out.println(arr[i]);
		}
	}
}
