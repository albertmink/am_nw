// Teil c
static int methode(int n) {
  int s = 1;
  for (int i = 0; i < n; i++) {
    for (int j = 1; j <= n; j++) {
      s *= j;
    }
  }
  return s;
}
