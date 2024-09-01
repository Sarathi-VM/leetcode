package leetCode;

import java.util.Arrays;

public class Cnvert1DarrayTo2Darray {

	public static void main(String[] args) {
		int[] orginal= {1,2};
		int m=1;
		int n=1;
		System.out.println(construct2DArray(orginal, m, n));

	}

	public static int[][] construct2DArray(int[] original, int m, int n) {
		int[][] a=new int[m][n];
		int k=0;
		int[][] b=new int[0][0];
		if(m*n!=original.length) {
			return b;
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=original[k++];
			}
		}
		if(m*n==original.length) {
			return a;
		}
		return b;	
	}

}
