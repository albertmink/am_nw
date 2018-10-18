// Teil b
static int methode(int n) {
  if ( n <= 0 ) {
    return 1;
  } else {
    return methode(n-1) * methode(n-1);
  }
}
