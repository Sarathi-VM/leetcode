package leetCode;

public class MaxDiffBetweenIntegers {

	public static void main(String[] args) {
		int[] nums = {87,68,91,86,58,63,43,98,6,40};
		System.out.println(maximumDifference(nums));
	}

	public static int maximumDifference(int[] nums) {
		int x= nums[0];
        int maxDiff= 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < x) {
                x = nums[i];
            }
            if (nums[i] - x > maxDiff) {
                maxDiff = nums[i] - x;
            }
        }
        
        if (maxDiff == 0) {
            return -1; 
        } 
        else {
            return maxDiff; 
        }
	}

}
