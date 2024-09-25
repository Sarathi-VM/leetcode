class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>(); 
        int[] ans=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                ans[j++]=nums[i];
            }
            h.add(nums[i]);
        }
        return ans;
    }
}
