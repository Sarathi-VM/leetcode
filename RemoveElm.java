package leetCode;


public class RemoveElm {

	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val=3;
		System.out.println(removeElement(nums,val));
	}

	public static int removeElement(int[] nums, int val) {
		int[] b=new int[nums.length];
		int j=0;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				count++;
				b[j++]=nums[i];
			}
			else {
				b[j++]=0;
			}
		}
		return count;	
	}
}
