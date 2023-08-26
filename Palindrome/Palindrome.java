
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(validPalindrome("aabdeenddbaagbddeedbaa")) ;
    }

    public static boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s, i+1, j)||isPalindrome(s, i, j-1);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s,int i,int j) {
        for(int a=i,b=j;a<b;a++,b--){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
        }
        return true;
    }
        
    
        
}