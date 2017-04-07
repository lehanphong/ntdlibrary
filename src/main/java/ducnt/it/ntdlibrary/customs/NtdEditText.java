package ducnt.it.ntdlibrary.customs;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import ducnt.it.ntdlibrary.ConstantNtdLib;

/**
 * Created by lhpdu on 12/3/2016.
 */

public class NtdEditText extends EditText {
    public NtdEditText(Context context) {
        super(context);
        init();
    }

    public NtdEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NtdEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface typeface = getTypeface();
        if (typeface != null && typeface.isBold()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + ConstantNtdLib.typeFontBold);
            setTypeface(tf);
        } else {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + ConstantNtdLib.typeFont);
            setTypeface(tf);
        }
    }

}
