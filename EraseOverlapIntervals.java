import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {
    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][] {{0,1},{1,3},{2,4}}));
    }

    private static int eraseOverlapIntervals(int[][] intervals) {
        if(0==intervals.length){
            return 0;
        }
        int sum=1;
        Arrays.sort(intervals,new Comparator<int[]>() {
            public int compare(int[] interval11, int[] interval12){
                return interval11[1]-interval12[1];//表示升序排列
                
            }
        });
        int n=intervals.length;
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=end){
                sum++;
                end=intervals[i][1];
            }
        }
        return n-sum;
    }

}
