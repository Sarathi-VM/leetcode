package leetCode;

public class MergeStringAlternately {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		mergeAlternately(word1, word2);

	}

	public static String mergeAlternately(String word1, String word2) {
		String s = "";
		for (int i = 0; i < word1.length() + word2.length(); i++) {
			if (i < word1.length()) {
				s += word1.charAt(i);
			}
			if (i < word2.length()) {
				s += word2.charAt(i);
			}
		}
		return s;
	}

}
