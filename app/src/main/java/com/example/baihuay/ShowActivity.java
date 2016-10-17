package com.example.baihuay;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by maximize on 10/17/2016 AD.
 */

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);


        String twoDigits = getIntent().getStringExtra("two");
        String threeDigits = getIntent().getStringExtra("three");


        if (twoDigits != null && threeDigits == null) {
            tv2.setText(new DecimalFormat("00").format(Integer.parseInt(twoDigits)));
        }else if(threeDigits != null && twoDigits == null) {
            tv1.setText("เลขท้าย 3 ตัว");
            tv2.setText(new DecimalFormat("000").format(Integer.parseInt(threeDigits)));
        }

    }
}
