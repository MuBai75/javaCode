public class SingleNonDuplicate{
    public static void main(String[] args){
        System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
    }
//因为只可能有一个不重复的数字，因此数组的长度一定是奇数
    public static int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<high){
            mid = (low+high)/2;

            if(nums[mid]!=nums[mid^1]){ //XOR,相同为0，不同为0
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return nums[low];
    }
}