package com.example.assgn1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void colorChangeRed(View vi) {
        btn = findViewById(R.id.button_red);
        btn.setBackgroundColor(Color.RED);
        txt = findViewById(R.id.textView2);
        txt.setText("RED");
        txt.setTextColor(Color.RED);
    }
    public void changeColorGreen(View vi) {
        btn = findViewById(R.id.button_green);
        btn.setBackgroundColor(Color.GREEN);
        txt = findViewById((R.id.textView2));
        txt.setText("GREEN");
        txt.setTextColor(Color.GREEN);
    }
}
