package CodingRoundIV;

public class leetcode3 {
	public static void main(String[] args) {
		String s="bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
		String sf="";
		System.out.println(sf.length());
	}

	public static int lengthOfLongestSubstring(String s) {
		int count=1;
		String dup=""+s.charAt(0);
		int max=0;
		for(int i=1;i<s.length();i++) {
			if(dup.contains(""+s.charAt(i))) {
				if(count>max) {
					max=count;
				}
				count=0;
			}
			dup+=s.charAt(i);
			count++;
		}
		return max;
	}
}
