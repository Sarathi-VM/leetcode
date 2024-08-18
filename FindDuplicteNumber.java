package leetCode;

public class FindDuplicteNumber {

	public static void main(String[] args) {
		int[] num= {1,2,3,4};
		System.out.println(findDuplicate(num));
	}

	public static int findDuplicate(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;	
	}

}
