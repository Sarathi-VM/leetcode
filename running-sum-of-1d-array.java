class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
            ans[i]=x;
        }
        return ans;
    }
}
