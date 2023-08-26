public class MaxProfit {
    public static void main(String[] agrs){
        System.out.println(maxProfit(new int[] {1,2}));
    }
    public static int maxProfit(int[] prices) {
        //将minprice设置为最大
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            else if(prices[i]-minprice>maxprofit){
                maxprofit=prices[i]-minprice;
            }
        }
        return maxprofit;
    }
}
