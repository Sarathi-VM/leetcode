package leetCode;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s="the sky is     blue baby";
		System.out.println(reverseWords(s));

	}

	public static String reverseWords(String s) {
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if(i>0 && s.charAt(i-1)==' ') {
					s2+=' ';
				}
				
				s2+=s.charAt(i);
			}
		}
		String[] ans=s2.split(" ");
		String s3="";
		for(int i=ans.length-1;i>=0;i--) {
			s3+=ans[i];
			s3+=" ";
		}
		return s3.trim();
	}

}
