import java.util.Arrays;

class AssignCookies {
    public static void main(String[] args){
        System.out.println(findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        //int n=0;
        int i=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                //n++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}