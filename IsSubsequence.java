public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
//类似回文那个题，动态规划的方法没有看懂
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}
