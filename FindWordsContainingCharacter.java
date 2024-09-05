package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

	public static void main(String[] args) {
		String[] words= {"abc","bcd","aaaa","cbc"};
		char x='a';
		System.out.println(findWordsContaining(words,x));
		
	}

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<words.length;i++) {
			String s="";
			s+=x;
			if(words[i].contains(s)) {
				al.add(i);
			}
		}
		return al;
	}

}
