public class Sqrtx {
    public static void main(String[] args){
        System.out.println(mySqrt(17));
    }
    public static int mySqrt(int x) {
        int left = 0;
        int ans = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid*mid <= x) {
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}
