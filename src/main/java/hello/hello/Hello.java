package hello.hello; // package must come first

public class Hello { // public classes "universally accessible"
  // must be in a sourcefile named to match the class
  // CAN ONLY HAVE ONE public class per sourcefile.

//  public static void main(String [] args) {
  public static void main(String ... commandLineArgs) {
    // double quotes for strings... (single means single char or character)
    System.out.println("Hello World!");

  }
}
