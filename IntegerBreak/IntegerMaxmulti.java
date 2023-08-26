package IntegerBreak;

public class IntegerMaxmulti {
    public static void main(String[] args) {
        System.out.println(integerBreak(2));
    }
    public static int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        int max=0;
        //i是n的子结构
        for(int i=2;i<=n;i++){
            max=0;
            //j是i的子结构
            for(int j=1;j<i;j++){
                max = Math.max(max,Math.max(j*(i-j), j*dp[i-j]));
            }
            dp[i]=max;
        }
        return dp[n];
    }
}
