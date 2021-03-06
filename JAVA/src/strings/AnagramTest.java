package strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide First String");
		String firstString = scanner.nextLine();

		System.out.println("Please Provide Second String");
		String secondString = scanner.nextLine();

		Boolean result = verifyAnagram(firstString, secondString);
		if (result)
			System.out.println("Strings Are Anagram");
		else
			System.out.println("Strings Are NOT Anagram");

	}

	public static boolean verifyAnagram(String firstString, String secondString) {

		// Remove all the white space and convert to lower case
		firstString = firstString.replaceAll("\\s", "").toLowerCase();
		secondString = secondString.replaceAll("\\s", "").toLowerCase();

		if (firstString.length() != secondString.length())
			return false;
		else {

		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < firstString.length(); i++) {
			char c = firstString.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		for (int i = 0; i < secondString.length(); i++) {
			char c = secondString.charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) == 1)
					map.remove(c);
				else
					map.put(c, map.get(c) - 1);
			} else
				return false;
		}
		if (map.size() > 0)
			return false;
		return true;
	}

}
