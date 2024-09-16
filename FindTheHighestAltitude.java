package leetcode_II;

import java.util.ArrayList;
import java.util.Collections;

public class FindTheHighestAltitude {

	public static void main(String[] args) {
		int[] gain= {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(gain));

	}

	public static int largestAltitude(int[] gain) {
		int max=Integer.MIN_VALUE;;
		int ans=0;
		for(int i=0;i<gain.length;i++) {
			ans=ans+gain[i];
			System.out.print(ans+" ");
			if(ans>max) {
				max=ans;
			}
		}
		return max>0?max:0;
	}
	//method 2
	public int largest(int[] gain) {
        ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		int j=0;
		for(int i=0;i<gain.length;i++) {
			al.add(al.get(j++)+gain[i]);
		}
		return Collections.max(al);
    }

}
