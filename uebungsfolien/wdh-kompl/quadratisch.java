// Aufwand quadratisch O( n(n+1) ) = O(n^2)
static int methode(int n) {
  int sum = 0;
  for (int i = 0; i <= n; i++) {
    int tmp = 0;
    for (int j = 0; j <= n; j++) {
      tmp = tmp + j;
    }
    sum = sum + tmp;
  }
  return s;
}
