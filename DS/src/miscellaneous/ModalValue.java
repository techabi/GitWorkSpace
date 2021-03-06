package miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModalValue {
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
		Map<Integer, Integer> map = new HashMap();
		int maxVal = 0;
		int modal = arr[0];
		for (int i = 0; i < length; i++) {
			if (map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				map.put(arr[i], val + 1);
				if (val + 1 > maxVal) {
					maxVal = val + 1;
					modal = arr[i];
				}
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println(map);

		return modal;
	}
}
