package Aditi;

public class P38 {
	// Method that takes an array as argument
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Passing array to method
        printArray(numbers);
    }
}
