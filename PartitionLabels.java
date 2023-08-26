import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> partition = new ArrayList<Integer>();
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a'] = i; //记录每个字母最后一次出现的位置
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, letters[s.charAt(i) - 'a']);
            //end代表第i+1个字母前最大的出现位置，eg，i=0：end=8，i=1:end=8
            if(i==end){ //当end和i重合时，就说明第i+1个字母前的所有字母，在后面都没有出现过；i.e. 前面所有的字母出现的最靠后的位置就是index i
                partition.add(end-start+1);
                start = end + 1;
            }
        }
        return partition;
    }
}
