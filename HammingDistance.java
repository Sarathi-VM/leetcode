package leetCode;

public class HammingDistance {

	public static void main(String[] args) {
		int x=3;
		int y=1;
		System.out.println(hammingDistance(x, y));
	}

	public static int hammingDistance(int x, int y) {
		String a=Integer.toBinaryString(x);
		String b=Integer.toBinaryString(y);
		int count=0;
		if(a.length()>b.length()) {
			int len=a.length()-b.length();
			String b1="";
			for(int i=0;i<len;i++) {
				b1+="0";
			}
			b1+=b;
			count=countof(a, b1);
		}
		else if(a.length()<b.length()) {
			int len=b.length()-a.length();
			String a1="";
			for(int i=0;i<len;i++) {
				a1+="0";
			}
			a1+=a;
			count=countof(a1, b);
		}
		else {
			count=countof(a, b);
		}
		return count;
	}
	public static int countof(String x,String y) {
		int c=0;
		for(int k=0;k<x.length();k++) {
			if(x.charAt(k)!=y.charAt(k)) c++;
		}
		return c;
	}

}
