package arrayTest;

//Here we will Create Simple Array & Perform operation on it Using Java
public class SimpleArray {

	public static void main(String[] args) {
        // declares an array of Strings
        String[] myArray;

        // allocates memory for 10 integers
        myArray = new String[9];
           
        // initialize first element ,Array index starts from Zero
        myArray[0] = "AUSTRALIA";
        // initialize second element
        myArray[1] = "BHUTAN";
        // and so forth
        myArray[2] = "CANADA";
        myArray[3] = "DENMARK";
        myArray[4] = "ENGLAND";
        myArray[5] = "FRANCE";
        myArray[6] = "GEORGIA";

        //We have left 2 positions or indexes
        System.out.println("Element at index 0: "
                           + myArray[0]);
        System.out.println("Element at index 1: "
                           + myArray[1]);
        System.out.println("Element at index 2: "
                           + myArray[2]);
        System.out.println("Element at index 3: "
                           + myArray[3]);
        System.out.println("Element at index 4: "
                           + myArray[4]);
        System.out.println("Element at index 5: "
                           + myArray[5]);
        System.out.println("Element at index 6: "
                           + myArray[6]);
        System.out.println("Element at index 7: "
                           + myArray[7]);
        System.out.println("Element at index 8: "
                           + myArray[8]);
        
        //If we add below line we will get ArrayIndexOutOfBoundsException becoz we are trying to access position out side defined array.
      
        /*System.out.println("Element at index 9: "
                           + myArray[9]);*/
        
        System.out.println("Complete Array :"+myArray);
        
        //We can also iterate an array by for loop 
        for (int i = 0; i < myArray.length; i++) {
			System.out.println("Position " +i+ " Holding Value :" + myArray[i]);
		}
    }
}
