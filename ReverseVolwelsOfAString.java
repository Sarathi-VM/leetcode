package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseVolwelsOfAString {

	public static void main(String[] args) {
		String s="Aa";
		System.out.println(reverseVowels(s));

	}

	public static String reverseVowels(String s) {
		ArrayList<Object> v=new ArrayList<Object>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
				v.add(s.charAt(i));	
			}
		}
		Collections.reverse(v);
		String ans="";
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				ans+=v.get(k++);
			}
			else {
				ans+=s.charAt(i);
			}
		}
		
		return ans;
	}

}
