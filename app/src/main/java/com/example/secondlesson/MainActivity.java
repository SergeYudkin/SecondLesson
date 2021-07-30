package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int value1 =1;
    private int value2 =2;
    private int value3 =3;
    private int value4 =4;
    private int value5 =5;
    private int value6 =6;
    private int value7 =7;
    private int value8 =8;
    private int value9 =9;
    private int value0 =0;

    TextView textView1;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constreint_layout);

        textView1 = findViewById(R.id.textView1);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                textView1.setText(String.valueOf(value1));
                break;
            case R.id.button2:
                textView1.setText(String.valueOf(value2));
                break;
            case R.id.button3:
                textView1.setText(String.valueOf(value3));
                break;
        }
    }
}