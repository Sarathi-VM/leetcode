package leetCode;

public class MatchingString {

	public static void main(String[] args) {
		String s="dsahjpjauf";
		String[] words= {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
		int n = 0;
        int count=0;
        for (int i = 0; i < words.length; i++) {
            n=0;
            for (int j = 0; j < s.length(); j++) {
            	if(n==words[i].length()) {
            		break;
            	}
            	if (words[i].charAt(n) == s.charAt(j)) {
                    n++;									
                }
            } 
            if(n==words[i].length()) {
            	count++;
            }
        }
        System.out.println(count);
	}
}
