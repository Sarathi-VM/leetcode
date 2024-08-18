package leetCode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "bc";
		String t = "ahbgdc";
		int k=0;
		for(int i=0;i<t.length();i++) {
			if(k==s.length()) {
				System.out.println(true);
			}
			if(s.charAt(k)==t.charAt(i)) {
				k++;
			}
		}
		System.out.println(k==s.length());
	}
}
