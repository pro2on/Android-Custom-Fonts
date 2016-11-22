package com.pro2on.customfont.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pro2on.customfont.R;

/**
 * Created by pro2on on 22.11.16.
 */

public class MainActivity extends AppCompatActivity {



    /**
     * Use thit layout
     * */
    private static final int LAYOUT = R.layout.activity_main;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(LAYOUT);
    }


}
