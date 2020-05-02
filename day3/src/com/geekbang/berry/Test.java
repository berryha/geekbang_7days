package com.geekbang.berry;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,8,6,2,5,4,8,3,7};
		System.out.print("befor:");
		for(int i=0; i<nums.length; i++)
			System.out.print(" " + nums[i]);
		
		Solution sl = new Solution();
		int j = sl.maxArea(nums);
		
		System.out.print("\r\nafter: " + j);
    }
}
