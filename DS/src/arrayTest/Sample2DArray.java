package arrayTest;

public class Sample2DArray {
  
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
				System.out.println(arr[i][j] +"-" + j);
			}
			System.out.println("");
		}
	}
}
