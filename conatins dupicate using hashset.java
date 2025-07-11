package Aditi;
import java.util.*;
/* Given an integer array nums, return true if any value appears at least 
twice in the array, and return false if every element is distinct.*/
public class P55 {
	public static boolean containsDuplicate(int nums[]){
		HashSet<Integer> set = new HashSet<>(); 
		for(int i=0; i<nums.length; i++) { 
			if(set.contains(nums[i])) { 
				return true;
			} else { 
					set.add(nums[i]); 
			} 
		} return false;
	}
	public static void main(String[] args) {
		int nums[] = {1,4,5,2};
		System.out.println(containsDuplicate(nums)); 
	}
}
