public class Rob {
    public static void main(String[] args) {
        System.out.println(rob(new int[] {1,2,3,1}));
    }

    private static int rob(int[] nums) {
        int curr=0;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            // prev=>n-2,curr=>n-1
            int max=Math.max(prev+nums[i], curr);
            prev=curr;
            curr=max;
        }
        return curr;
    }
}
