package ducnt.it.ntdlibrary.utilities;

import android.content.Intent;

import com.google.gson.Gson;

import ducnt.it.ntdlibrary.customs.LogNtd;

/**
 * Created by duc.nguyentien on 21/02/2017.
 */

public class IntentUtil {

    public static void setIntentObject(Object object, String key, Intent intent) {
        Gson gson = new Gson();
        String objectStr = gson.toJson(object);
        LogNtd.d("intent setIntentObject: " + objectStr);
        intent.putExtra(key, objectStr);
    }

    public static Object getIntentObject(String key, Intent intent) {
        Gson gson = new Gson();
        LogNtd.d("intent getIntentObject: " + intent.getStringExtra(key));
        Object object = gson.fromJson(intent.getStringExtra(key), Object.class);
        return object;
    }
}
