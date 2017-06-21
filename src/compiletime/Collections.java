package compiletime;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 *         20/06/2017
 */
public class Collections {

  private static List<String> getProtectedTurtles() {
    return java.util.Collections.unmodifiableList(getTurtles());
  }

  private static List<String> getTurtles() {
    return Arrays.asList("Leo", "Don", "Raf", "Mike");
  }

  private static void infiltrate(List<String> src) {
    src.add("Shredder");
  }

  public static void main(String[] args) {
    infiltrate(getTurtles());

    infiltrate(getProtectedTurtles());
  }
}
