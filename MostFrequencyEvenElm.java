package leetCode;

import java.util.Arrays;

public class MostFrequencyEvenElm {

	public static void main(String[] args) {
		int[] a= {4,2,9,2,4};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		boolean[] b=new boolean[a.length];
		int count=0;
		int max=0;
		int val=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && b[i]==false) {
			count=0;
			int temp=a[i];
			for(int j=0;j<a.length;j++) {
				if(temp==a[j]) {
					count++;
					b[j]=true;
				}
			}
			
			if(count>max) {
				max=count; 
				val=a[i]; 
			}
			}	
		}
		if(count!=0) {
		System.out.println("the value :"+val+" , The count: "+max);
		}
		else {
			System.out.println("-1");
		}
		

	}

}
