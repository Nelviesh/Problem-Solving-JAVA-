class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;

        for (int i = 0; i < size; i++) {
            // Check if the current spot is empty
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == size - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    // Place a flower at the current spot
                    flowerbed[i] = 1;
                    n--;

                    // If we have placed all the flowers needed, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // If we loop through the entire flowerbed and can't place all flowers, return false
        return n <= 0;
    }
}
