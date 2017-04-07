package ducnt.it.ntdlibrary;

/**
 * Created by lhpdu on 12/18/2016.
 */

public final class ConstantNtdLib {
    public static final String typeFont = "REGULAR.OTF";
    public static final String typeFontBold = "MYRIADPRO-SEMIBOLD.OTF";


    public static boolean getIsLive() {
        if (BuildConfig.DEBUG) return false;
        return true;
    }
}
