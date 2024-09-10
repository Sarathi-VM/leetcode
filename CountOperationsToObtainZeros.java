package leetCode;

public class CountOperationsToObtainZeros {

	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		System.out.println(countOperations(num1, num2));

	}

	public static int countOperations(int num1, int num2) {
		int count=0;
		while(num1>0 && num2>0) {
			System.out.println("h");
			if(num1>num2) {
				num1=num1-num2;
				System.out.println(num1);
				count++;
			}
			else {
				num2=num2-num1;
				System.out.println(num2);
				count++;
			}
		}
		return count;
	}

}
