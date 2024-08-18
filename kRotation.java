package leetCode;

import java.util.Arrays;

public class kRotation {

	public static void main(String[] args) {
		int[] a= {-1,-100,3,99};
		int k=2;
		int h=k-1;
		for(int i=0;i<=k/2;i++) {
			int temp=a[i];
			a[i]=a[h];
			a[h--]=temp;	
		}
		k=k+1;							
		for(int i=0;i<=k/2;i++) {
			int y=a.length-1;
			int temp=a[k];   
			a[k]=a[y];        
			a[y--]=temp;
			k++;
		}
//		int y=a.length-1;
//		int n=y;
//		for(int i=0;i<y/2;i++) {
//			int temp=a[i];
//			a[i]=a[n];
//			a[n--]=temp;
//		}
		System.out.println(Arrays.toString(a));

	}

}
