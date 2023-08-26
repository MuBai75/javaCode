public class NextGreatestLetter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'g'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid = 0;
        if(target>=letters[letters.length-1])
            return letters[0];
        while (left < right) {
            mid = (right + left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[left];
    }
}
