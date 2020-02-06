package com.example.spoonproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvone = findViewById(R.id.tvone);
        Button btnsignin = findViewById(R.id.btnsignin);
        btnsignin.getBackground().setAlpha(200);

        String text = "By logging in you agree to the Terms of Use and Privacy Policy.";
        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(MainActivity.this, "KOSONG", Toast.LENGTH_SHORT).show();
            }
        };  ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(MainActivity.this, "KOSONG", Toast.LENGTH_SHORT).show();
            }
        };
ss.setSpan(clickableSpan1, 31, 43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
ss.setSpan(clickableSpan2, 48, 62, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    tvone.setText(ss);
    tvone.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
