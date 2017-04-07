package ducnt.it.ntdlibrary.utilities;

/**
 * Created by lhpdu on 1/2/2017.
 */

public class UtilsString {
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.equals("") || str.equals("null")) {
            return true;
        }
        return false;
    }
}
