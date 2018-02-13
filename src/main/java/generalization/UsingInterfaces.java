package generalization;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingInterfaces {
  public static void main(String[] args) {
//    List<String> ls = new ArrayList<>();
    List<String> ls = new LinkedList<>();
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");
    System.out.println("Size of list is " + ls.size());

    System.out.println("item(1) is " + ls.get(1));

    ls.add("William");
    System.out.println("Size of list is " + ls.size());

    for (String s : ls) {
      System.out.println("> " + s);
    }
  }
}
