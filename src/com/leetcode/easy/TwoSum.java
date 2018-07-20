package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 3 };
		int[] result = twoSum(num, 6);
		System.out.println(result[0] + "  " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				res[0] = map.get(nums[i]);
				res[1] = i;
				return res;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return res;
	}
}
