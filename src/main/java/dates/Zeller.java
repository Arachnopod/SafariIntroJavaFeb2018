package dates;

public class Zeller {
  // method overloading

  // Java does not have default argument values, nor named arguments
  // but it does have method overloading
  // "Same basic method name, but differing argument type sequence"
  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2018);
  }

  public static int dayOfWeek(int day, int month, int year) {
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
    return dow;
  }

  public static void main(String[] args) {
    System.out.println("Today is day number " +dayOfWeek(13, 2, 2018));
    System.out.println("Today is day number " +dayOfWeek(13, 2));
  }
}
