package day2.geekbang.berry;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4,4,5,6};
		System.out.print("befor:");
		for(int i=0; i<nums.length; i++)
			System.out.print(" " + nums[i]);
		
		Solution sl = new Solution();
		int j = sl.removeDuplicates(nums);
		
		System.out.print("\r\nafter:");
		for(int i=0; i<j; i++)
			System.out.print(" " + nums[i]);
    }
}
