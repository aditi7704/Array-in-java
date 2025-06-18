package Aditi;
// Max Subarray Sum using Kadane's Algorithm (O(n))
public class P48 {
	public static void maxSubarraySum(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			currSum += numbers[i];
			if (currSum > maxSum) {
				maxSum = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}

		System.out.println("Max subarray sum = " + maxSum);
	}

	public static void main(String args[]) {
		int numbers[] = {1, 2, 3, 45};
		maxSubarraySum(numbers);
	}
}
