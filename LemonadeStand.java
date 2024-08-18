package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class LemonadeStand {

	public static void main(String[] args) {
		int[] bills= {5, 5, 10, 5, 5, 10, 20, 5, 10, 20, 20, 10, 5, 10, 20, 20, 5, 5, 10, 20, 10, 5, 10, 5, 5, 10, 20, 5, 10, 20, 20, 10, 5, 10, 20, 20, 5, 5, 10, 20, 10,5, 10, 5, 10, 5, 10, 5, 20, 20, 20, 10, 10, 5};
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<bills.length;i++) {
			if(bills[i]==5) {
				l.add(bills[i]);
			}
			else if(bills[i]==10) {
				if(l.contains(5)) {
					l.remove(l.indexOf(5));
					l.add(bills[i]);
				}
				else {
					System.out.println(false);
				}
			}
			else if(bills[i]==20) {
				if((l.contains(10)&& l.contains(5)) ){
					l.remove(l.indexOf(5));
					l.remove(l.indexOf(10));
					l.add(bills[i]);
				}
				else if(Collections.frequency(l,5)>3) {
					l.removeAll(Collections.singleton(5));
				}
				else {
					System.out.println("false");
				}
			}
		}
		System.out.println(true);
	}
}
