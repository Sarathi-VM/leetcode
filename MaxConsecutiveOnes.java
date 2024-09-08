package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max=Integer.MIN_VALUE;
		int count=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
			}
			else {
				al.add(count);
				count=0;
			}
			if(i==nums.length-1 && nums[i]==1) {
				al.add(count);
			}
		}
		System.out.println(al);
		return Collections.max(al);
	}

}
