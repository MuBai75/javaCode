
public class NumberOfArithmeticSlices {
    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(new int[] {1,2,3,8,9,10}));
    }

    private static int numberOfArithmeticSlices(int[] nums) {
        // 优化
        // 由于 dp[i] 只和 dp[i - 1] 有关，所以可以进行状态压缩，
        // 只用一个变量 k 来表示以 nums[i] 为终点的等差数列的个数
        // int[] dp=new int[nums.length];
        int sum=0;
        int k=0;
        for(int i=1;i<nums.length-1;i++){
            if(2*nums[i]==nums[i-1]+nums[i+1]){
                // dp[i] = 1;
                k++;
                sum=sum+k;//每次多k个+1，+2，+3，+4....
            }
            else{
                k=0;
                // dp[i] = 0;
            }
        }
        // System.out.println(Arrays.toString(dp));
        
        /* int dplength=0;
        for(int i=1;i<dp.length;i++){
            if(dp[i]==1){
                dplength++;
            }
            else{
                // System.out.println(dplength);
                sum += (dplength)*(dplength+1)/2;
                dplength=0;
            } 
        } */
        return sum;
    }
}
