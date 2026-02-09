package Array;

public class BestTimetoBuySellStock{

    public static int BuySellStock(int arr[]){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : arr){
            if(price < minPrice){
                minPrice = Math.min(price, minPrice);
            }
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int arr[] ={7, 1, 5, 3, 6, 4};

        System.out.println("the Best time to Buy and Sell stock is: " + BuySellStock(arr));

    }
}