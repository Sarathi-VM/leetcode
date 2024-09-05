package leetCode;

public class FinaValueOfVariableAfterPerformingOperations {

	public static void main(String[] args) {
		String[] operations= {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(operations));

	}
	public static int finalValueAfterOperations(String[] operations) {
		int x=0;
		for(int i=0;i<operations.length;i++) {
			if(operations[i].startsWith("--") ||operations[i].endsWith("--") ) {
				x=x-1;
			}
			else {
				x=x+1;
			}
		}
		return x;
	}

}
