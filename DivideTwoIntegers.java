package leetCode;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		int a=-2147483648;
		int b=-1;
		if (a == Integer.MIN_VALUE && b == -1) {
            System.out.println(Integer.MAX_VALUE); 
        }else {
        	System.out.println(a/b);
        }
		
	}

}
