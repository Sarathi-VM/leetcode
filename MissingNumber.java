class Solution {
    public int missingNumber(int[] nums) {
       int tot = (nums.length*(nums.length+1))/2;
		int n = 0;
		for(int i =0;i<nums.length;i++) {
			n += nums[i];
		}
		return Math.abs(tot-n);
    }
}
