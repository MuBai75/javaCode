##荷兰国旗（颜色排序）
+ 思想
>双指针+一次循环$i$
>设置$p0,p1$两个指针，$p0$指向第一个1的位置，$p1$指向第一个2的位置。

>$i$指向1时，插入1时与$p1$交换,前面多了一个1，第一个2的位置随之后移
```java
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
```


>当$i$指向0时，与$p0$交换，插入0；但是插入0时有一种情况，若$ p0 < p1 $ i.e. 有一个1已经排好了，但是因为要交换0，所以将1换到了后面$i$处，因此，再次$i$ 与$p1$交换，将1换回去;因为前面多了一个0，那么第一个1和第一个2的位置，随之后移。

```java
    
    else if(0==nums[i]){
        swap(nums, i, p0);
        if(p0<p1){
            swap(nums,i,p1);
        }
        p0++;
        p1++;
    }
```

排好0和1，2也排好了