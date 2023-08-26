public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    private static int climbStairs(int n) {
        int i=1;
        int a=0,b=0,c=1;
        //a=x-2,b=x-1
        while(i<=n){
            a=b;
            b=c;
            c=a+b;
            i++;
        }
        return c;
    } 
}
