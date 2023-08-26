public class SearchRange {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[] {5,7,7,8,8,10},8));
    }
    public static int[] searchRange(int[] nums,int target){
        int leftIndex=BinarySearch(nums,target,true);
        int rightIndex=BinarySearch(nums,target,false)-1;
        System.out.println(leftIndex);
        if(leftIndex<=rightIndex&&rightIndex<nums.length&&nums[leftIndex]==target&&nums[rightIndex]==target){
            return new int[] {leftIndex,rightIndex};
        }
        return new int[] {-1,-1};
    }
    public static int BinarySearch(int[] nums,int target,boolean low){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int ans=nums.length;
        while(left<=right){ //注意此处有等号
            mid=left+(right-left)/2;
            if(nums[mid]>target || low&&nums[mid]>=target){
                right=mid-1;
                ans=mid;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
