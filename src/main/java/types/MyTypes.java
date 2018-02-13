package types;

public class MyTypes {
  public static void main(String[] args) {
    // eight "primitive" types (simple number-things
    boolean isGreen = false;
    byte x = 99; // 8 bit signed number
    short y = 1234; // 16 bit number
    char c = 'X'; // Unicode character, use single quotes
    int i = 12345; // 32 bit signed number
    long l = 12345678890L; // 64 bit signed number, "L" suffix on literal indicates a long literal
    float f = 3.14F;// 32 bit floating point, F extension indicates float size
    double d = 3.14; // 64 bit floating point.

    // operators, + - * / % (modulus)
    // ternary operator, "if expression"
    // comparisons give boolean values (specifically)
    // > < >= <= != ==  note != for not equal
//    short s = x + y; // all arithmetic results in at least an int!
    int sum = x + y;
    // ternary operator example
    String message = sum > 1234 ? "Greater" : "Less";
    System.out.println(message);

    // if MUST take a boolean expression

    if (sum > 1234) {
      System.out.println("Sum is greater than 1234");
    } else {
      System.out.println("Sum is not greater than 1234");
    }
    int count = 3;
    while (count > 0) {
      // + with a String argument converts the other argument to String
      // and concatenates
      System.out.println("Count is " + count);
      // Decrement count
//      count = count - 1;
      // equivalent to expression-on-left = expression-on-left - expression on right
//      count -= 1;
//      count--; // "post decrement" count
      --count; // "pre decrement" count

      for (int idx = 0; idx < 4; idx++) {
        System.out.println("idx has value " + idx);
      }

      // operands are evaluated left to right...

      System.out.println("Hello, " + 1 + 2 + 3);
      System.out.println(1 + 2 + 3 + " Hello");
    }
  }
}
