package CodingRoundIV;

public class leetcode2264 {
	public static void main(String[] args) {
		String num="42352338";
		System.out.println(largestGoodInteger(num));
	}
	public static String largestGoodInteger(String num) {
        int count=1;
		int ans=0;
		int max=0;
		for(int i=0;i<num.length()-1;i++) {
			int value1=Character.getNumericValue(num.charAt(i));
			int value2=Character.getNumericValue(num.charAt(i+1));
			if(value1-value2==0) {
				++count;
			}
			else {
				count=1;
			}
			if(count==3 & value1>max) {
				max=value1;
				ans=value1;
			}
		}
		if(max==0) {
			return "";
		}
		return String.valueOf(ans);
    }
}
