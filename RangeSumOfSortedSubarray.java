package leetCode;
import java.util.Arrays;
public class RangeSumOfSortedSubarray {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int n=4;
		int left=1;
		int right=5;
		int[] a=new int[n*(n+1)/2];
        int z=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int x =i;
             for(int j=0;j<nums.length;j++){
                if(x<nums.length){
                    sum+=nums[x++];
                    a[z++]=sum;
                }
            }
        } 
        Arrays.sort(a);
        int ans=0;
        final int mod = (int) 1e9 + 7;
        for(int k=left-1; k<right;k++){
            ans=(ans+a[k])% mod;
        }
        System.out.println(ans);

	}

}
