class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[j++];
            ans[++i]=nums[n++];
        }
        return ans;
    }
}
