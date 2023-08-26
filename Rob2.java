public class Rob2 {
    public static void main(String[] args) {
        System.out.println(rob2(new int[] { 1, 2, 3 }));
    }

    public static int rob2(int[] nums) {
        if (nums.length >= 2) {
            return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
        }
        return rob(nums, 0, nums.length);
    }

    private static int rob(int[] nums, int start, int end) {
        int curr = 0;
        int prev = 0;
        for (int i = start; i < end; i++) {
            // prev=>n-2,curr=>n-1
            int max = Math.max(prev + nums[i], curr);
            prev = curr;
            curr = max;
        }
        return curr;
    }
}
