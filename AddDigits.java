package leetCode;

public class AddDigits {

	public static void main(String[] args) {
		int num=38;
		System.out.println(addDigits(num));
	}

	public static int addDigits(int num) {
        int x = num;
        while(x > 9){
            int ans =0;
            int rem=0;
            while( x != 0){
                rem = x%10;
                ans+=rem;
                x = x/10;
            }
            x = ans;
        }
        return x;
    }

}
