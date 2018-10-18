// Aufwand linear O(n)
static int methode(int n) {
  int fak = 1;
  if ( n <= 1) {
    return fak;
  } else {
    return fak*methode(fak-1);
  }

}
