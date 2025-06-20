package Aditi;

/*
 There is an integer array nums sorted in ascending order (with distinct 
 values). Prior to being passed to your function, nums is possibly rotated 
 at an unknown pivot index k (1 <= k < nums.length) such that the 
 resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], 
 nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
 might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 Given the array nums after the possible rotation and an integer target, 
 return the index of target if it is in nums, or -1 if it is not in nums.
 You must write an algorithm with O(log n) runtime complexity.
*/

public class P57 {

    public static int search(int[] nums, int target) {
        // min will have index of minimum element of nums
        int min = minSearch(nums);

        // find in sorted right
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        } 
        // find in sorted left
        else {
            return search(nums, 0, min - 1, target);
        }
    }

    // binary search to find target in left to right boundary
    public static int search(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // find index of smallest element
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Best time to buy and sell stock (max profit)
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        // Test case for rotated sorted array search
        int[] nums = {4,  5, 6, 7, 0, 1, 2};
        int target = 3;

        int index = P57.search(nums, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
