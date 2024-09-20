package leetcode_II;

import java.util.ArrayList;

public class ClearDigits {

	public static void main(String[] args) {
		String s="abc499";
		System.out.println(clearDigits(s));

	}
	public static String clearDigits(String s) {
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>96) {
				al.add(s.charAt(i));
			}
			else {
				al.remove(al.size()-1);
			}
		}
		String s1="";
		for(int i=0;i<al.size();i++) {
			s1+=al.get(i);
		}
		return s1;
		
	}

}
