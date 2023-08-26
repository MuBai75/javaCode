public class KthLargest {
    public static void main(String[] args){
        System.out.println(findKthLargest(new int[] {3,2,1,5,6,4} , 2)) ;
    }
    //heapsort-->find kth
    public static int findKthLargest(int[] nums,int k){
        int heapsize=nums.length;
        buildHeap(nums,heapsize);
        for(int i=nums.length-1;i>=nums.length-k+1;--i) {//交换堆顶与堆底元素，找到最大元素的最终正确位置
            swap(nums,0,i);
            --heapsize;
            maxiHeapify(nums, 0, heapsize);
        }
        return nums[0];
    }
    public static void swap(int[] a, int i, int largest){
        int temp=a[i];
        a[i]=a[largest];
        a[largest]=temp;
    }
    public static void buildHeap(int a[], int heapsize){
        for(int i=heapsize/2-1;i>=0;i--){
            maxiHeapify(a,i,heapsize);
        }
    }
    public static void maxiHeapify(int[] a, int i, int heapsize) {
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
            maxiHeapify(a, largest, heapsize);
        }
    }
}
