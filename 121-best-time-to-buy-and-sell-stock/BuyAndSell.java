
class BuyAndSell {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int result = (buyAndSell(prices));
		System.out.println(result);
	}
	
	public static int buyAndSell(int[] prices) {
	
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price: prices) {
			if (price < minPrice) {
				minPrice = price;
			}
			
			int profit = price - minPrice;
			
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}


		return maxProfit;
	}
}
