package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadAFile {
  public static void main(String[] args) {
    try (Reader r = new FileReader("MyText.txt");) {
//      int c;
//      while ((c = r.read()) != -1) {
//        System.out.print((char)c);
//      }

      BufferedReader br = new BufferedReader(r);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("> " + line);
      }
    } catch (IOException ioe) {
      System.out.println("Failed to open file??? " + ioe.getMessage());
    }
  }
}
