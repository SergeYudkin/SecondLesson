package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int value1 = 1;
    private int value2 = 2;
    private int value3 = 3;
    private int value4 = 4;
    private int value5 = 5;
    private int value6 = 6;
    private int value7 = 7;
    private int value8 = 8;
    private int value9 = 9;
    private int value0 = 0;
    private String valueDot = "•";
    private String valueC = "С";
    private String valuePlus = "+";
    private String valueEqually = "=";
    private String valuePercent = "%";
    private String valueMultiply = "*";
    private String valueDivide = "÷";
    private String valueSquare = "√¯";
    private String valueMinus = "-";


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
    Button buttonDot;
    Button buttonС;
    Button buttonPlus;
    Button buttonEqually;
    Button buttonPercent;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonSquare;
    Button buttonMinus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constreint_layout);

        textView1 = findViewById(R.id.textView1);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonDot = findViewById(R.id.buttonDot);
        buttonС = findViewById(R.id.buttonC);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqually = findViewById(R.id.buttonEqually);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonMinus = findViewById(R.id.buttonMinus);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonС.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqually.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                textView1.setText(String.valueOf(value1));
                break;
            case R.id.button2:
                textView1.setText(String.valueOf(value2));
                break;
            case R.id.button3:
                textView1.setText(String.valueOf(value3));
                break;
            case R.id.button4:
                textView1.setText(String.valueOf(value4));
                break;
            case R.id.button5:
                textView1.setText(String.valueOf(value5));
                break;
            case R.id.button6:
                textView1.setText(String.valueOf(value6));
                break;
            case R.id.button7:
                textView1.setText(String.valueOf(value7));
                break;
            case R.id.button8:
                textView1.setText(String.valueOf(value8));
                break;
            case R.id.button9:
                textView1.setText(String.valueOf(value9));
                break;
            case R.id.button0:
                textView1.setText(String.valueOf(value0));
                break;
            case R.id.buttonDot:
                textView1.setText(String.valueOf(valueDot));
                break;
            case R.id.buttonC:
                textView1.setText(String.valueOf(valueC));
                break;
            case R.id.buttonPlus:
                textView1.setText(String.valueOf(valuePlus));
                break;
            case R.id.buttonEqually:
                textView1.setText(String.valueOf(valueEqually));
                break;
            case R.id.buttonPercent:
                textView1.setText(String.valueOf(valuePercent));
                break;
            case R.id.buttonMultiply:
                textView1.setText(String.valueOf(valueMultiply));
                break;
            case R.id.buttonDivide:
                textView1.setText(String.valueOf(valueDivide));
                break;
            case R.id.buttonSquare:
                textView1.setText(String.valueOf(valueSquare));
                break;
            case R.id.buttonMinus:
                textView1.setText(String.valueOf(valueMinus));
                break;
        }
    }
}