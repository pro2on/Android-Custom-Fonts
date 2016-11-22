package com.pro2on.customfont.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by pro2on on 22.11.16.
 */

public class FontManager {


    private static volatile FontManager instance;


    // reject use constructor
    private FontManager() {
    }





    private static Typeface font1;
    private static Typeface font2;


    public Typeface getFont1() {
        return font1;
    }

    public static void setFont1(Typeface font1) {
        FontManager.font1 = font1;
    }

    public Typeface getFont2() {
        return font2;
    }

    public static void setFont2(Typeface font2) {
        FontManager.font2 = font2;
    }

    public static FontManager getInstance(Context context) {

        FontManager local = instance;

        if (local == null) {
            synchronized (FontManager.class) {
                local = instance;
                if (local == null) {
                    instance = local = new FontManager();
                }
            }


            // setup fonts
            setFont1(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf"));
            setFont2(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-ThinItalic.ttf"));

        }

        return local;
    }


}
