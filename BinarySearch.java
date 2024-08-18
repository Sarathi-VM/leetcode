package leetCode;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {6,8,3,2,7,18,56,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int tar=58;
		int start=0;
		int end=a.length-1;
		int mid=(start+end)/2;
		while(start<=end){
			mid=(start+end)/2;
			if(tar<a[mid]) {
				end=mid-1;
			}
			else if(tar>a[mid]) {
				start=mid+1;
			}
			else if(tar==a[mid]) {
				System.out.println("Found");
				System.out.println("at index : "+mid);
			}
		}
	}
}
