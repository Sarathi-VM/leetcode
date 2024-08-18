package leetCode;

public class ClimbStairs {

	public static void main(String[] args) {
		int n=1;
		climbStairs(n);
	}
	public static  void climbStairs(int n) {
		int n1=1;
		int n2=1;
		int n3=0;
		//System.out.print(n1+" "+n2);
		if(n==1) {
			System.out.println("1");
			return ;
		}
		for(int i=2;i<=n;i++) {
			n3=n1+n2;
			//System.out.print(" "+n3);;
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
	}

}
