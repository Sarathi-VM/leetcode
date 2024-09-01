package leetCode;

public class FindTheEncryptedString {

	public static void main(String[] args) {
		String s="dart";
		int k=6;
		System.out.println(getEncryptedString(s, k));

	}

	public  static String getEncryptedString(String s, int k) {
		StringBuilder sb=new StringBuilder();
		if(k>s.length()) {
			k=Math.abs(s.length()-k);
		}
		sb.append(s.substring(k,s.length()));
		System.out.println(sb);
		sb.append(s.substring(0, k));
		return sb.toString();
	}

}
