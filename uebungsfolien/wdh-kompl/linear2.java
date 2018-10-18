// Aufwand linear O(2(n-1)) = O(n)
static int methode(int n) {
  int s = 1;
  for (int i = 1; i <= n; i++) {
    s = s * i;
    s = s + 2;
  }
  return s;
}
