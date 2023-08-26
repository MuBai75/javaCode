class SortColors {
    public void sortColors(int[] nums) {
        int p0=0;
        int p1=0;
        for(int i=0;i<nums.length;i++){
            if(1==nums[i]){
                swap(nums,i,p1);
                p1++;
            }
            else if(0==nums[i]){
                swap(nums, i, p0);
                if(p0<p1){
                    swap(nums,i,p1);
                }
                p0++;
                p1++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
}