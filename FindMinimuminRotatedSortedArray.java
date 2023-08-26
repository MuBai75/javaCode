public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args){
        System.out.println(findMin(new int[] {5,6,7,4,5}));
    }
    public static int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid = 0;
        while(low<high){
            mid = low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high = mid; //为什么不加
            }
            else{
                low=mid+1;  //为什么加一
            }
        }
        return nums[low];
    }
}
