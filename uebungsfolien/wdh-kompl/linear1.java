// Aufwand linear O(n-1) = O(n)
static int methode(int n) {
  int s = 1;
  for (int i = 1; i <= n; i++) {
    s = s * i;
  }
  return s;
}
