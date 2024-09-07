package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(containsDuplicate(nums));

	}

	public static  boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]==nums[i]) {
				return true;
			}
		}
		
		return false;
	}

}
