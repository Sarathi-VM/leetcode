package leetCode;
public class BestTimeToSellStock {

	public static void main(String[] args) {
		int [] prices= {2,1,2,1,0,1,2};
		int profit=0;
		int buy=prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]<buy) {
				buy=prices[i];
			}
			else if(prices[i]-buy>profit) {
				profit=prices[i]-buy;
			}
		}
		System.out.println(profit);
	}
}
