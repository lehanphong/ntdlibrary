package ducnt.it.ntdlibrary.customs.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;

import ducnt.it.ntdlibrary.R;

/**
 * Created by lhpdu on 1/6/2017.
 */

public class DialogProgressBar {
    Dialog dialog;

    public DialogProgressBar(Context context) {
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_progress);
        View v = dialog.getWindow().getDecorView();
        v.setBackgroundResource(android.R.color.transparent);
        dialog.getWindow().setBackgroundDrawableResource(R.color.colorNull);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
    }

    public void show() {
        if (!dialog.isShowing())
            dialog.show();
    }

    public void dismiss() {
        if (dialog.isShowing())
            dialog.dismiss();
    }
}
