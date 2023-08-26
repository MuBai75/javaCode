import java.util.Arrays;
import java.util.Comparator;

public class BurstBaloons {
    public static void main(String[] args){
        System.out.println(findMinArrowShots(new int[][] {{1,2},{3,4},{5,6},{7,8}}));
        System.out.println(findMinArrowShots(new int[][] {{10,16},{2,8},{1,6},{7,12}}));
        System.out.println(findMinArrowShots(new int[][] {{1,2},{2,3},{3,4},{4,5}}));
    }
    private static int findMinArrowShots(int[][] points) {
        if(0==points.length){
            return 0;
        }
        Arrays.sort(points,new Comparator<int[]>() {
            public int compare(int[] points1,int[] points2){
                //return points1[1]-points2[1];
                //[[-2147483646,-2147483645],[2147483646,2147483647]]会溢出
                return points1[1]<points2[1]? -1:1;
            }
        });
        int n=1;
        int right=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>right){ //没重合
                n++;
                right=points[i][1];
            }
        }
        return n;
    }
}
