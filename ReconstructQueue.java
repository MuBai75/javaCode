import java.util.Arrays;
import java.util.Comparator;

public class ReconstructQueue {
    public static void main(String[] args) {
        int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        int[][] pqueue = reconstructQueue(people);
        for (int[] p : pqueue) {
            for (int i : p) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person1[0] - person2[0];
                } else {
                    return person2[1] - person1[1];
                }
            }
        });
        int n = people.length;
        int[][] pqueue = new int[n][];
        for (int[] person : people) {
            int spaces = person[1] + 1;
            for (int i = 0; i < n; i++) {
                if (pqueue[i] == null) {
                    spaces--;
                    if (0 == spaces) {
                        pqueue[i] = person;
                        break;
                    }
                }

            }
        }
        return pqueue;
    }

}
