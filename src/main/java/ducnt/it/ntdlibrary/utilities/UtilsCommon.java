package ducnt.it.ntdlibrary.utilities;

import android.content.Context;
import android.os.Environment;
import android.view.WindowManager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import ducnt.it.ntdlibrary.customs.LogNtd;

/**
 * Created by lhpdu on 1/2/2017.
 */

public class UtilsCommon {
    public static void writeSdCard(String data) {
        String sdcard = Environment
                .getExternalStorageDirectory()
                .getAbsolutePath() + "/myfile.txt";
        try {
            OutputStreamWriter writer =
                    new OutputStreamWriter(
                            new FileOutputStream(sdcard));
            writer.write(data);
            writer.close();
            LogNtd.d(sdcard);
//            LogNtd.d(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int minArrInt(int[] arrInt) {
        int length = arrInt.length;
        int min = -1;
        if (length == 1) {
            min = arrInt[0];
        } else if (length > 1) {
            min = arrInt[0];
            for (int i = 1; i < length; i++) {
                if (min > arrInt[i]) {
                    min = arrInt[i];
                }
            }
        }
        return min;
    }

    public static int getWithScreen(Context context) {
        android.view.Display displays = ((WindowManager) context.getApplicationContext().getSystemService(context
                .getApplicationContext().WINDOW_SERVICE)).getDefaultDisplay();
        return displays.getWidth();
    }
}