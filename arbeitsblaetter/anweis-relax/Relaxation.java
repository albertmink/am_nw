// Relaxationsverfahren

#include <iostream.h>
#include <math.h>

// Eingabe der Matrix
void Eingabe( double * * A, int n )
{
  for ( int i = 1; i <= n; i++ )
    for ( int j = 1; j <= n; j++ ) {
      cin >> A[i][j];
    }
}

// Eingabe des Vektors
void Eingabe( double * b, int n )
{
  for ( int i = 1; i <= n; i++ ) {
    cin >> b[i];
  }
}

// Ausgabe von Vektor
void Ausgabe( double * b, int n )
{
  for ( int i = 1; i <= n; i++ ) {
    cout << b[i] << endl;
  }
}

// Funktion Krit
int Krit( double * * A, int n )
{
  int q = 1;
  double sum;
  int i = 1;
  do {
    sum = 0;
    for ( int k = 1; k <= n; k++ ) if ( k != i ) {
        sum += fabs( A[i][k] );
      }
    if ( fabs( A[i][i] ) <= sum ) {
      q = 0;
    }
    i++;
  }
  while ( i <= n && q == 1 );
  if ( q == 0 ) {
    cout << "Kriterium verletzt!!" << endl;
  }
  return q;
}

// Funktion Relaxit
void Relaxit( double * * A, double * b, double * xk, double * xk1, int n, double omega )
{
  int j;
  double sum;
  for ( int i = 1; i <= n; i++ ) {
    sum = 0;
    for ( j = 1; j <= i - 1; j++ ) {
      sum += A[i][j] * xk1[j];
    }
    for ( j = i + 1; j <= n; j++ ) {
      sum += A[i][j] * xk[j];
    }
    xk1[i] = ( 1 - omega ) * xk[i] - omega / A[i][i] * ( sum - b[i] );
  }
}

// Funktion Abbruchkrit
int Abbruchkrit( double * xk, double * xk1, double eps, int n )
{
  double max = 0;
  double diff;
  for ( int i = 1; i <= n; i++ ) {
    diff = fabs( xk1[i] - xk[i] );
    if ( diff > max ) {
      max = diff;
    }
  }
  if ( max < eps ) {
    return 1;
  }
  return 0;
}

int main()
{
  double eps, omega;
  double * * A;
  double * b, * xk, * xk1;
  int i, j, n;
  cin >> n;
  cin >> omega;
  cin >> eps;
// Speicher allokieren
  A = new double * [n + 1];
  for ( i = 0; i <= n; i++ ) {
    A[i] = new double[n + 1];
  }
  b = new double[n + 1];
  xk = new double[n + 1];
  xk1 = new double[n + 1];
// A und b einlesen
  Eingabe( A, n );
  Eingabe( b, n );
// Startvektor
  for ( i = 1; i <= n; i++ ) {
    xk1[i] = b[i] / A[i][i];
  }
// Relaxationsverfahren ausfuehren
  if ( Krit( A, n ) == 1 ) {
    do {
      for ( j = 1; j <= n; j++ ) {
        xk[j] = xk1[j];
      }
      Relaxit( A, b, xk, xk1, n, omega );
    }
    while ( Abbruchkrit( xk, xk1, eps, n ) != 1 );
  }
  else { // Zeilensummenkriterium nicht erfuellt
    for ( i = 0; i <= 10; i++ ) {
      Ausgabe( xk1, n );
      for ( j = 1; j <= n; j++ ) {
        xk[j] = xk1[j];
      }
      Relaxit( A, b, xk, xk1, n, omega );
    }
  }
  Ausgabe( xk1, n );
// Speicher freigeben
  delete[] xk1;
  delete[] xk;
  delete[] b;
  for ( i = 0; i <= n; i++ ) {
    delete[] A[i];
  }
  delete[] A;
  return 0;
}
