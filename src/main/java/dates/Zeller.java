package dates;

// can declare more than one class in a source, but only one can be public
// "enum" is a convenience type of class
enum DayOfWeek {
  SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

  // Can add constructors, fields, and methods here!
  @Override
  public String toString() {
    return name().toLowerCase();
  }
}

public class Zeller {
  // method overloading

  // Java does not have default argument values, nor named arguments
  // but it does have method overloading
  // "Same basic method name, but differing argument type sequence"
  public static DayOfWeek dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2018);
  }

  public static DayOfWeek dayOfWeek(int day, int month, int year) {
    int calcMonth = month;
    int calcYear = year;
    if (month < 3) {
      calcMonth += 12;
      calcYear -= 1;
    }
    int dow = (
        day
        + (13 * (calcMonth + 1) / 5)
        + calcYear
        + calcYear / 4
        - calcYear / 100
        + calcYear / 400
        ) % 7;
    return DayOfWeek.values()[dow];
  }

  public static void main(String[] args) {
    System.out.println("Today is "
        + dayOfWeek(13, 2, 2018));
    System.out.println("Today is "
        + dayOfWeek(13, 2));
  }
}
