package ducnt.it.ntdlibrary.customs;

import android.util.Log;

import ducnt.it.ntdlibrary.BuildConfig;
import ducnt.it.ntdlibrary.ConstantNtdLib;

/**
 * Created by lhpdu on 1/2/2017.
 */

public class LogNtd {
    private static final String NtdLogD = "DNTD";
    private static final String NtdLogE = "ENTD";
    public static StringBuilder sbLog  = new StringBuilder("");

    private static boolean showLog() {
        if (BuildConfig.DEBUG)
            return true;
        return false;
    }

    public static void d(String content) {
        if (showLog()) {
            if (content.length() > 4000) {
                int chunkCount = content.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= content.length()) {
                        Log.d(NtdLogD, content.substring(4000 * i));
                    } else {
                        Log.d(NtdLogD, content.substring(4000 * i, max));
                    }
                }
            } else {
                Log.v(NtdLogD, content.toString());
            }
        }
    }

    public static void d(String tagName, String content) {
        if (showLog()) {
            Log.d(tagName, content);
        }
        sbLog.append("\nLog: "+ content);
    }

    public static void e(Exception e) {
        String content = e.getMessage();
        if (showLog()) {
            Log.e(NtdLogE, content);
        }
        sbLog.append("\nException: "+ e.getMessage());
    }


}
