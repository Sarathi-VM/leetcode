package leetCode;

import java.util.Arrays;

public class HeightCheaker {

	public static void main(String[] args) {
		 int[] heights = {5,1,2,3,4};
		 System.out.println(heightChecker(heights));

	}

	public static int heightChecker(int[] heights) {
		int count=0;
		int[] x=heights.clone();
		Arrays.sort(x);
		for(int i=0;i<heights.length;i++) {
			if(heights[i]!=x[i]) {
				count++;
			}
		}
		return count;
	}
}
