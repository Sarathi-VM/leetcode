class Solution {
    public boolean canAliceWin(int[] nums) {
        int ones = 0;
        int twos =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10 && nums[i]>0){
                ones += nums[i];
            }else{
                twos += nums[i];
            }
        }
        if(ones != twos){
            return true;
        }
        return false;
     }
}
