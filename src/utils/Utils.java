package utils;

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */
public class Utils {
    private Utils() {
        throw new AssertionError("you cannot instantiate me");
    }

    public static int doubleInt(int param) {
        return param * 2;
    }
}
