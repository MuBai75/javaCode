import java.util.Arrays;

class Merge {
    public static void main(String[] args) {
        int[] nums1 = { 0, 0, 0, 0, 0, 0 };
        int[] nums2 = { 1, 2, 10 };
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length ;

       while (n > 0) {
           if (m > 0 && nums1[m-1] > nums2[n-1]) {
               nums1[--i] = nums1[--m]; 
               //替代swap，参考官方题解“逆向双指针解法”的公式
           }else{
               nums1[--i] = nums2[--n]; 
               //替代swap，参考官方题解“逆向双指针解法”的公式
           }
         
       }
   }

}