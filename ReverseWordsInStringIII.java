package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsInStringIII {

	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String[] a=s.split(" ");
		String ans="";
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length()-1;j>=0;j--) {
				ans+=a[i].charAt(j);
			}
			if(i!=a.length-1) ans+=" ";
		}
		return ans;
	}

}
