package ducnt.it.ntdlibrary.customs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.TextView;

import ducnt.it.ntdlibrary.ConstantNtdLib;
import ducnt.it.ntdlibrary.R;

/**
 * Created by lhpdu on 12/3/2016.
 */

public class NtdTextView extends TextView {
    public NtdTextView(Context context) {
        super(context);
        init();

    }

    public NtdTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        initAttrs(context, attrs);
    }

    public NtdTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        initAttrs(context, attrs);
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

    void initAttrs(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributeArray = context.obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomTextView);

            Drawable drawableLeft = null;
            Drawable drawableRight = null;
            Drawable drawableBottom = null;
            Drawable drawableTop = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                drawableLeft = attributeArray.getDrawable(R.styleable.CustomTextView_drawableLeftCompat);
                drawableRight = attributeArray.getDrawable(R.styleable.CustomTextView_drawableRightCompat);
                drawableBottom = attributeArray.getDrawable(R.styleable.CustomTextView_drawableBottomCompat);
                drawableTop = attributeArray.getDrawable(R.styleable.CustomTextView_drawableTopCompat);
            } else {
                final int drawableLeftId = attributeArray.getResourceId(R.styleable.CustomTextView_drawableLeftCompat, -1);
                final int drawableRightId = attributeArray.getResourceId(R.styleable.CustomTextView_drawableRightCompat, -1);
                final int drawableBottomId = attributeArray.getResourceId(R.styleable.CustomTextView_drawableBottomCompat, -1);
                final int drawableTopId = attributeArray.getResourceId(R.styleable.CustomTextView_drawableTopCompat, -1);

                if (drawableLeftId != -1)
                    drawableLeft = AppCompatResources.getDrawable(context, drawableLeftId);
                if (drawableRightId != -1)
                    drawableRight = AppCompatResources.getDrawable(context, drawableRightId);
                if (drawableBottomId != -1)
                    drawableBottom = AppCompatResources.getDrawable(context, drawableBottomId);
                if (drawableTopId != -1)
                    drawableTop = AppCompatResources.getDrawable(context, drawableTopId);
            }
            setCompoundDrawablesWithIntrinsicBounds(drawableLeft, drawableTop, drawableRight, drawableBottom);
            attributeArray.recycle();
        }


    }
}