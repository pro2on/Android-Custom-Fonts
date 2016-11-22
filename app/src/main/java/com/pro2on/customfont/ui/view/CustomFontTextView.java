package com.pro2on.customfont.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pro2on.customfont.R;
import com.pro2on.customfont.util.FontManager;


/**
 * Created by pro2on on 22.11.16.
 */

public class CustomFontTextView extends TextView {

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupFont(attrs, context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupFont(attrs, context);
    }

    private void setupFont(AttributeSet attrs, Context context) {

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.CustomFontTextView, 0, 0);

        a.recycle();

        int font = a.getInt(R.styleable.CustomFontTextView_fonts, -1);
        FontManager fontManager = FontManager.getInstance(context);

        switch (font) {
            case 0:
                setTypeface(fontManager.getFont1());
                break;
            case 1:
                setTypeface(fontManager.getFont2());
                break;
        }

    }
}
