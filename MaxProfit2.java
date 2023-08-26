/* 
//greedy
public class MaxProfit2 {
    public static void main(String[] args){
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        //int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length-1;i++){
            maxprofit+=Math.max(0, prices[i+1]-prices[i]);
        }
        return maxprofit;
    }
} */
//dynamic programming
public class MaxProfit2 {
    public static void main(String[] args){
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int length=prices.length;
        if(length<2){
            return 0;
        }
        int[] profit=new int[length];
        int[] hold=new int[length];
        //持有的利润
        profit[0]=0;
        //持有股票
        hold[0]=-prices[0];
        for(int i=1;i<length;i++) {
            profit[i]=Math.max(profit[i-1], hold[i-1]+prices[i]);//max函数，比较两个参数，哪个大返回哪个
            hold[i]=Math.max(hold[i-1], profit[i-1]-prices[i]);
        }
        return profit[length-1];
    }
}
