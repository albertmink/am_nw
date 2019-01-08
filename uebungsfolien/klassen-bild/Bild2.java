public Bild() {
  System.out.println("Geben Sie Bildgroesse an"); 
  size = sc.nextInt(); 
  pixels = new Pixel[size][size]; 

  for( int x = 0; x < size; x++ ) { 
    for( int y = 0; y < size; y++ ) { 
      System.out.println("Pixel["+x+"]["+y+"] RGB Wert:");
      int[] rgb = new int[3]; 
      for( int k = 0; k < rgb.length; k++ ) { 
        rgb[k] = sc.nextInt(); 
      }
      pixels[x][y] = new Pixel(x,y,rgb); 
    }
  }
}
