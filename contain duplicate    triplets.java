package Aditi;
/*
 Given an integer array nums, return all the triplets [nums[i], nums[j], 
  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + 
  nums[k] == 0.Notice that the solution set must not contain duplicate
   triplets.
 */
import java.util.*;

public class P60 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Generate all possible triplets
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {

					// Check if sum is zero
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> triplet = new ArrayList<>();
						triplet.add(nums[i]);
						triplet.add(nums[j]);
						triplet.add(nums[k]);

						// Sort to ensure uniqueness
						Collections.sort(triplet);
						result.add(triplet);
					}
				}
			}
		}

		// Remove duplicate triplets by using LinkedHashSet
		result = new ArrayList<>(
			new LinkedHashSet<>(result)
		);

		return result;
	}

	public static void main(String[] args) {
		int[] nums = {-2, -2, 0, 2, 2};
		List<List<Integer>> output = threeSum(nums);
		System.out.println(output);
	}
}
