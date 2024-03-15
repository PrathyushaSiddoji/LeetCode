class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int len = flowerbed.length;
    if (len == 1 && flowerbed[0] == 0) {
      flowerbed[0] = 1;
      n--;
    } else {
      if (flowerbed[0] == 0 && flowerbed[1] == 0) {
        flowerbed[0] = 1;
        n--;
      }
      for (int i = 1; i < len - 1; i++) {
        if (flowerbed[i] == 0) {
          if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
            flowerbed[i] = 1;
            n = n - 1;
          }
        }
        if (i == len - 2 && n != 0) {
          if (flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
            flowerbed[len - 1] = 1;
            n--;
          }
        }
      }
    }
    for (int j = 0; j < len; j++) {
      System.out.print(flowerbed[j]);
    }
    System.out.println();
    System.out.println(n);
    if (n <= 0) {
      return true;
    } else return false;
  }
}