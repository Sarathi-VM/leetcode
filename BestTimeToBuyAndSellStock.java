package leetCode;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		int ans=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				ans+=prices[i]-prices[i-1];
			}
		}
		return ans;
	}

}
