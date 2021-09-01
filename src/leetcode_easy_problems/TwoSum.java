package leetcode_easy_problems;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 **/

public class TwoSum {

	public static void main(String[] args) {

		int srr[] = { 1, 3, 7, 5, 2 };
		int result[] = twoSum(srr, 8);
		for (int i : result)
			System.out.println(i);
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] intArray = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				intArray[0] = map.get(temp);
				intArray[1] = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		return intArray;

	}
}
