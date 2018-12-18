// Aufwand linear O(n)
static int methode(int n) {
  if ( n <= 1) {
    return n;
  } else {
    return n*methode(n-1);
  }

}
