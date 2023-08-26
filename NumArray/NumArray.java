package NumArray;

public class NumArray {
    int[] preSums;
    public NumArray(int[] nums) {
        preSums = new int[nums.length];
        if(nums.length==0)
            return;
        preSums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            preSums[i] +=preSums[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return preSums[right];
        }
        else{
            return preSums[right]-preSums[left-1];
        }
    }
}
