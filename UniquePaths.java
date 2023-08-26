import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i==0||j==0)
                    dp[i][j]=1;
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        return dp[m-1][n-1];
    }
    //优化
    public static int uniquePathsOpt(int m, int n) {
        int[] dp=new int[n];
        Arrays.fill(dp, 1);
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i==0||j==0)
                    dp[j]=1;
                else{
                    dp[j]=dp[j]+dp[j-1];
                }
            }
        return dp[n-1];
    }
}
