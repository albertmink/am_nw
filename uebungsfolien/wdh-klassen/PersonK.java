public class PersonK {
  public String name;
  public int year;
  public char gender;
  // Konstruktor
  PersonK(String name_, int year_, char gender_) {
    name = name_;
    year = year_;
    gender = gender_;
  }

  public static void main( String[] args) {
    PersonK arbeiter = new PersonK("Horst", 1966, 'm');
    System.out.println(arbeiter.name);
  }
}
