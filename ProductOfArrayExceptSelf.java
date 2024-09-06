package leetCode;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(productExceptSelf(nums));
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] f=new int[nums.length];
		f[0]=1;
		int[] e=new int[nums.length];
		e[e.length-1]=1;
		for(int i=1;i<nums.length;i++) {
			f[i]=f[i-1]*nums[i-1];
		}
		for(int j=nums.length-2;j>=0;j--) {
			e[j]=e[j+1]*nums[j+1];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=f[i]*e[i];
		}
		return nums;
				
	}

}
