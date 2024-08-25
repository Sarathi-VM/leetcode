package leetCode;


public class EncryptedIntegers {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println("hai");
		sumOfEncryptedInt(nums);
		
	}

	public static void sumOfEncryptedInt(int[] nums) {
		int y=0;
		int ans=0;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			y=0;
			count=0;
			int max=Integer.MIN_VALUE;
			int x=nums[i];
			while(x!=0) {
				int rem=x%10;
				if(rem>max) {
					max=rem;
				}
				x/=10;
				count++;
			}
			for(int j=0;j<count;j++) {
				y=y*10+1;
			}
			System.out.println(y);
			ans=ans+(max*y);
		}
		System.out.println(ans);
	}

}
