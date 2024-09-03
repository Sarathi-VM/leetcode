package leetCode;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12,0,9,7,0,8,7,0,5,4,3,0};
		moveZeroes(nums);

	}

	public static void moveZeroes(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				count++;
			}
		}
		while(count>0) {
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]==0) {
				int temp=nums[i-1];
				nums[i-1]=nums[i];
				nums[i]=temp;
			}
		}
		count--;
		}
		System.out.println(Arrays.toString(nums));
	}
}
