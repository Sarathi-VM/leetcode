package leetCode;

import java.util.Arrays;

public class DIstring {

	public static void main(String[] args) {
		String s="IDID";
		diStringMatch(s);
		

	}

	public  static void diStringMatch(String s) {
		int[] a=new int[s.length()+1];
		int i=0;
		int d=s.length();
		int count=0;
		for(int k=0;k<s.length();k++) {
			if(s.charAt(k)=='I') {
				a[k]=i++;
				count++;
			}
			else if(s.charAt(k)=='D') {
				a[k]=d--;
			}	
		}
		a[a.length-1]=count;
		System.out.println(Arrays.toString(a));
		
	}
}
