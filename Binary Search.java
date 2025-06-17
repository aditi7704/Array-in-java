package Aditi;
// Binary Search
public class P42 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparisons
            if (numbers[mid] == key) { // FOUND
                return mid;
            }

            if (numbers[mid] < key) { // RIGHT
                start = mid + 1;
            } else { // LEFT
                end = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;

        int result = binarySearch(numbers, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
