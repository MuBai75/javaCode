public class PlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (n > 0 && i < flowerbed.length) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (flowerbed[i] == 0) {
                if (i + 1 == flowerbed.length || flowerbed[i + 1] == 0) {
                    n--;
                    i += 2;
                } else {
                    i += 3;
                }
            }
        }
        return n == 0;
    }
}
