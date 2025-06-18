package Aditi;
//Max Subarray Sum using Prefix Sum
public class P47 {
	public static void maxSubarraySum(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		// Step 1: Create and fill prefix array
		int prefix[] = new int[numbers.length];
		prefix[0] = numbers[0];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + numbers[i];
		}

		// Step 2: Calculate all subarray sums using prefix
		for (int start = 0; start < numbers.length; start++) {
			for (int end = start; end < numbers.length; end++) {
				currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
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
