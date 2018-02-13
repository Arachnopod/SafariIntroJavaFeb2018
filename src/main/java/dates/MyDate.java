package dates;

public class MyDate {
  int day;
  int month;
  int year;

  public void addOneDay() {
    this.day += 1;
  }

  public static void addOneDay(MyDate d) {
    d.day += 1;
    // if day wraps end of month, fix it!!!

  }

  public static void main(String[] args) {
    MyDate d1 = new MyDate();
    MyDate d2 = new MyDate();

    d1.day = 12;
    d1.month = 3;
    d1.year = 1999;

    d2.day = 24;
    d2.month = 7;
    d2.year = 2015;

    System.out.println("day: " + d1.day
        + " month: " + d1.month + " year: " + d1.year);

    addOneDay(d1);
    System.out.println("day: " + d1.day
        + " month: " + d1.month + " year: " + d1.year);

    d1.addOneDay();
    System.out.println("day: " + d1.day
        + " month: " + d1.month + " year: " + d1.year);
  }
}
