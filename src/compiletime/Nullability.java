package compiletime;

import java.util.Objects;
import pojos.JUser;

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 *         20/06/2017
 */
public class Nullability {
  private static JUser getUser() {
    return null;
  }

  private static void handleUser(JUser user) {
    Objects.requireNonNull(user, "User should not be null.");
    System.out.println("User's name: " + user.getFirstName());
  }

  public static void main(String[] args) {
    handleUser(getUser());
  }
}
