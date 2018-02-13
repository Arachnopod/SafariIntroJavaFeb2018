package generalization;

public class SpySatellite implements Photographer {
  @Override
  public void takePhoto() {
    System.out.println("beeep beep.. click, I can read your license plate");
  }
}
