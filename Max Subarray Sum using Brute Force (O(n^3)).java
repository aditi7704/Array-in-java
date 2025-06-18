package Aditi;
//Max Subarray Sum using Brute Force (O(n^3))
public class P46 {
	public static void maxSubarraySum(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) { // start index
			for (int j = i; j < numbers.length; j++) { // end index
				int currSum = 0;
				for (int k = i; k <= j; k++) { // sum of subarray i to j
					currSum += numbers[k];
				}
				if (currSum > maxSum) {
					maxSum = currSum;
				}
			}
		}

		System.out.println("Max subarray sum = " + maxSum);
	}

	public static void main(String args[]) {
		int numbers[] = {1, 2, 3, 45};
		maxSubarraySum(numbers);
	}
}
