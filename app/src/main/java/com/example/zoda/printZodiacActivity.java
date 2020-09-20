package com.example.zoda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import static com.example.zoda.MainActivity.MSG;

public class printZodiacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_zodiac);

        Intent intent = getIntent();
        String message[] = (String[]) getIntent().getSerializableExtra(MSG);
        int k = 0;
        TextView textView1 = findViewById(R.id.resultText);
        TextView textView2 = findViewById(R.id.keyPhrase);
        TextView textView3 = findViewById(R.id.element);
        TextView textView4 = findViewById(R.id.traits);
        TextView textView5 = findViewById(R.id.info);
        TextView textView6 = findViewById(R.id.warning);

        //inserting colours to all textViews
        SpannableString ss1 = new SpannableString(message[0]);
        SpannableString ss2 = new SpannableString(message[1]);
        SpannableString ss3 = new SpannableString(message[2]);
        SpannableString ss4 = new SpannableString(message[3]);
        SpannableString ss5 = new SpannableString(message[4]);
        SpannableString ss6 = new SpannableString(message[5]);

        if(!message[0].isEmpty())
        {

        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.rgb(255, 0, 0));
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(Color.rgb(0, 206, 209));
        ForegroundColorSpan fcsGreen = new ForegroundColorSpan(Color.rgb(76, 187, 23));
        ForegroundColorSpan fcsPinks = new ForegroundColorSpan(Color.rgb(240, 10, 136));
        ForegroundColorSpan fcsOrange = new ForegroundColorSpan(Color.rgb(253, 106, 2));
        ForegroundColorSpan fcsBlack = new ForegroundColorSpan(Color.BLACK);
        ForegroundColorSpan fcsG = new ForegroundColorSpan(Color.rgb(76, 230, 23));
        ForegroundColorSpan fcsR = new ForegroundColorSpan(Color.rgb(255, 60, 30));
        ForegroundColorSpan fcsPurple = new ForegroundColorSpan(Color.rgb(106, 13, 173));

        ss1.setSpan(fcsBlack, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcsBlack, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss3.setSpan(fcsBlack, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss4.setSpan(fcsBlack, 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss5.setSpan(fcsBlack, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        ss1.setSpan(fcsRed, 10, ss1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcsBlue, 13, ss2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss3.setSpan(fcsPinks, 10, ss3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss4.setSpan(fcsPurple, ss4.toString().indexOf(":") + 1, ss4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss5.setSpan(fcsOrange, 13, ss5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        if (!message[3].equals("Traits \t: \n")) {
            ss4.setSpan(fcsG, ss4.toString().indexOf(":") + 1, ss4.toString().indexOf(":") + 1 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            ss4.setSpan(fcsR, ss4.toString().lastIndexOf(":") - 11, ss4.toString().lastIndexOf(":") + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }
        ForegroundColorSpan fcsWarning = new ForegroundColorSpan(Color.RED);
        ss6.setSpan(fcsWarning, 0, ss6.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView1.setText(ss1);
        textView2.setText(ss2);
        textView3.setText(ss3);
        textView4.setText(ss4);
        textView5.setText(ss5);
        textView6.setText(ss6);
    }
}