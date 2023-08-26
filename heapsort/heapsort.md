#Heapsort
>**建堆**
从堆的中间开始，依次向下调整，传参调整第**i**个结点
```java
    public static void buildHeap(int a[], int heapsize){
        for(int i=heapsize/2-1;i>=0;i--){
            AdjustHeap(a,i,heapsize);
        }
    }
```
>**调整**
判断结点 **i** 的左孩子和右孩子是否比i的值大，如果大就交换并继续调整交换后的堆；反之不变
```java
    public static void AdjustHeap(int[] a, int i, int heapsize) {
        int left=i*2+1;
        int right=2*i+2;
        int largest=i;
        if(left<heapsize&&a[left]>a[largest]){
            largest=left;
        }
        if(right<heapsize&a[right]>a[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(a,i,largest);
            AdjustHeap(a, largest, heapsize);
        }
    }
    public static void swap(int[] a, int i, int largest){
        int temp=a[i];
        a[i]=a[largest];
        a[largest]=temp;
    }
```
>**堆排序**
1. 建堆
2. 利用for loop 从最后一个结点开始，将堆顶元素与堆底元素交换
3. 调整，找到最大值的正确位置
```java
    public static void findKthLargest(int[] nums,int k){
        int heapsize=nums.length;
        buildHeap(nums,heapsize);
        for(int i=nums.length-1;i>=0;--i) {
            swap(nums,0,i);//交换堆顶与堆底元素，找到最大元素的最终正确位置
            --heapsize;//最大值已经找到正确位置，不再参与排序
            AdjustHeap(nums, 0, heapsize);
        }
    }
```
>时间复杂度 $O(nlogn)$，建堆的时间代价是 $O(n)$，删除的总代价是$O(klog n)$，因为 $k < n$，故渐进时间复杂为 
$O(n+klogn)=O(nlogn)$。

>空间复杂度：$O(log n)$，即递归使用栈空间的空间代价。