// Teil d
static int methode(int n) {
  if ( n <= 0 ) {
    return 1;
  } else {
    return n * methode(n/2);
  }
}
