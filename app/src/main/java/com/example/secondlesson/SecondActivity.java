package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;

import android.widget.RadioButton;


public class SecondActivity extends AppCompatActivity implements View.OnClickListener {





    static final int light = 1;
    static final int dark = 2;


    static final String KEY_ST = "st";
    static final String KEY_CURRENT_ST = "current_st";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getRaalStyle(getCurrentStyle()));
        setContentView(R.layout.constreint_layout);

        init();




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




    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.dark:
                setCurrentStyle(dark);
                break;
            case R.id.light:
                setCurrentStyle(light);
                break;

            default:
                break;

        }
        recreate();

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







}