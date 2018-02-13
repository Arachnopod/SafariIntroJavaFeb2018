package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtility {
  public static void main(String[] args) {
    try (BufferedReader br = Files.newBufferedReader(
                 Paths.get("subdirectory", "MyText.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("-- " + line);
      }
    } catch (IOException ioe) {
      System.out.println("IO problem " + ioe.getMessage());
    }
  }
}
