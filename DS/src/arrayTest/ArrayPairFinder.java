package arrayTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Find Pair of index values  for the given sum.
 * O(n) Solution
 * 
 * input=[ 9, 8, 7, 4, 5, 0]
 * sum = 15;
 * 
 * O.P= Pair found at index 1 and 2
 * 
 */
public class ArrayPairFinder {

	// Find pair with given sum in the array
	public static void main(String[] args) {
		int[] A = { 9, 8, 7, 4, 5, 0 };
		int sum = 15;
		searchPair(A, sum);
	}

	public static void searchPair(int[] A, int sum) {
		// create Hash Map object
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < A.length; i++) {
			// checking if the pair (arr[i], sum-arr[i]) exists

			// if difference is seen before, print the pair
			if (map.containsKey(sum - A[i])) {
				System.out.println("Pair found at index " + map.get(sum - A[i])
						+ " and " + i);
				return;
			}

			// store index of current element in the map
			map.put(A[i], i);
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

}
