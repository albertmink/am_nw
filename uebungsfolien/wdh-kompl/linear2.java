// Aufwand linear O(2n)
static int methode(int n) {
  int s = 1;
  for (int i = 1; i <= n; i++) {
    s = s * i;
    s = s + 2;
  }
  return s;
}
