package leetCode;

import java.util.ArrayList;

public class HappyNumbers {

	public static void main(String[] args) {
		int n=3;
		System.out.println(isHappy(n));

	}

	public static  boolean isHappy(int n) {
		boolean flag=false;
		int count=0;
		if(n==1 || n==7) {
			return true;
		}
		else {
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(n!=0) {
			int rem=n%10;
			al.add(rem);
			n/=10;
			count++;
			
		}
		if(count==1) {
			return false;
		}
		int ans=0;
		for(Integer num:al) {
			ans+=(int) Math.pow(num, 2);
		}
		System.out.println(ans);
		flag=isHappy(ans);
		if(flag) {
			return true;
		}
		else {
			return false;
		}
		}
	}

}
