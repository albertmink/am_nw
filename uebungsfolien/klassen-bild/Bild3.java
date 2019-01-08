...
public static void write(Bild bild) 
{
  for( int x = 0; x < bild.size; x++ ) { 
    for( int y = 0; y < bild.size; y++ ) { 
      bild.pixels[x][y].write(); 
    }
  }
}
...
