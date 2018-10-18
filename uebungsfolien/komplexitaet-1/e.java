// Teil e
static int methode(int n) {
  if (n <= 0) {
    return 1;
  } else {
    int s = 1;
    for (int i = 0; i < n; i++) {
      s *= methode(n-1);
    }
    return s;
  }
}
