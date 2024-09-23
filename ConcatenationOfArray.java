class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=2;
        int j=0;
        int[] ans=new int[k*nums.length];
        while(k>0){
            for(int i=0;i<nums.length;i++){
                ans[j++]=nums[i];
            }
        k--;
        }
        return ans;
    }
}
