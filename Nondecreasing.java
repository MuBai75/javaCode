public class Nondecreasing {
    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[] { 3, 4, 2, 3 }));
    }

    private static boolean checkPossibility(int[] nums) {
        if(nums.length==1)  return true;
        boolean flag = nums[0] <= nums[1] ? true : false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (flag) {
                    if (nums[i - 1] <= nums[i + 1]) {
                        nums[i] = nums[i + 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                    flag = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
