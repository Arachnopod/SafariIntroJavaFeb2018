package dates;

public class TestMyDate {

  public static void main(String[] args) throws BadDateException {
    MyDate d1 = new MyDate(12, 3, 1999);
    MyDate d2 = new MyDate(24, 7, 2015);

//    d1.day = 12;
//    d1.month = 3;
//    d1.year = 1999;
//
//    d2.day = 24;
//    d2.month = 7;
//    d2.year = 2015;

    System.out.println("day: " + d1);

//    addOneDay(d1);
//    System.out.println("day: " + d1.day
//        + " month: " + d1.month + " year: " + d1.year);

    d1.addOneDay();
    System.out.println("day: " + d1);

    try {
      MyDate d3 = new MyDate(0, 0, 0);
    } catch (BadDateException bde) {
      System.out.println("oops, bad date!");
    } catch (IllegalArgumentException ex) {
      System.out.println("That didn't work, I got " + ex.getMessage());
    }
    System.out.println("Program is still running...");
  }
}
