package dates;

class BadDateException extends Exception {}

public class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) throws BadDateException {
    if (day < 1 || day > 31 || month < 1 || month > 12) {
//      throw new IllegalArgumentException("Bad date values");
      throw new BadDateException();
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void addOneDay() {
    this.day += 1;
    // should handle wrap of month and year!
  }
//
//  public static void addOneDay(MyDate d) {
//    d.day += 1;
//    // if day wraps end of month, fix it!!!
//
//  }

  @Override
  public String toString() {
    return "day: " + this.day + " month: " + this.month
        + " year: " + this.year;
  }
}
