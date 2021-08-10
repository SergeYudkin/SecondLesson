package com.example.secondlesson;




import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends SecondActivity implements View.OnClickListener {



    static String TAG = "values";

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

    Values values;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constreint_layout);

        init();
        initView();
        initListeners();
        values = new Values();


    }

    private void init() {
        ((RadioButton)findViewById(R.id.dark)).setOnClickListener(this);
        ((RadioButton)findViewById(R.id.light)).setOnClickListener(this);
        switch (getCurrentStyle()){
            case 1:
                ((RadioButton)findViewById(R.id.dark)).setChecked(true);
                break;
            case 2:
                ((RadioButton)findViewById(R.id.light)).setChecked(true);
                break;
        }
    }


    private void setCurrentStyle(int currentStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_ST,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_CURRENT_ST,currentStyle);
        editor.apply();
    }
    private int getCurrentStyle() {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_ST,MODE_PRIVATE);
        return (sharedPreferences.getInt(KEY_CURRENT_ST,-1));

    }

    private int getRaalStyle(int curentTheme) {
        switch (curentTheme) {
            case light:
                return R.style.light1;

            case dark:
                return R.style.dark1;
            default: return 0;

        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        values.setCurrentText(textView1.getText().toString());
        outState.putSerializable(TAG, values);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        values = (Values) savedInstanceState.getSerializable(TAG);
        textView1.setText(values.getCurrentText());


    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                textView1.setText(String.valueOf(values.getValue1()));
                break;
            case R.id.button2:
                textView1.setText(String.valueOf(values.getValue2()));
                break;
            case R.id.button3:
                textView1.setText(String.valueOf(values.getValue3()));
                break;
            case R.id.button4:
                textView1.setText(String.valueOf(values.getValue4()));
                break;
            case R.id.button5:
                textView1.setText(String.valueOf(values.getValue5()));
                break;
            case R.id.button6:
                textView1.setText(String.valueOf(values.getValue6()));
                break;
            case R.id.button7:
                textView1.setText(String.valueOf(values.getValue7()));
                break;
            case R.id.button8:
                textView1.setText(String.valueOf(values.getValue8()));
                break;
            case R.id.button9:
                textView1.setText(String.valueOf(values.getValue9()));
                break;
            case R.id.button0:
                textView1.setText(String.valueOf(values.getValue0()));
                break;
            case R.id.buttonDot:
                textView1.setText(String.valueOf(values.getValueDot()));
                break;
            case R.id.buttonC:
                textView1.setText(String.valueOf(values.getValueC()));
                break;
            case R.id.buttonPlus:
                textView1.setText(String.valueOf(values.getValuePlus()));
                break;
            case R.id.buttonEqually:
                textView1.setText(String.valueOf(values.getValueEqually()));
                break;
            case R.id.buttonPercent:
                textView1.setText(String.valueOf(values.getValuePercent()));
                break;
            case R.id.buttonMultiply:
                textView1.setText(String.valueOf(values.getValueMultiply()));
                break;
            case R.id.buttonDivide:
                textView1.setText(String.valueOf(values.getValueDivide()));
                break;
            case R.id.buttonSquare:
                textView1.setText(String.valueOf(values.getValueSquare()));
                break;
            case R.id.buttonMinus:
                textView1.setText(String.valueOf(values.getValueMinus()));
                break;

            case R.id.dark:
                setCurrentStyle(dark);
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                recreate();
                break;
            case R.id.light:
                setCurrentStyle(light);
                Intent j = new Intent(this,MainActivity.class);
                startActivity(j);
                recreate();
                break;


            default:
                break;

        }

    }


    private void initView() {
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

    }

    private void initListeners() {
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
}