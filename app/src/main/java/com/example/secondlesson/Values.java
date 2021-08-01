package com.example.secondlesson;

import java.io.Serializable;

public class Values implements Serializable {

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

    private String currentText = "";

    public String getCurrentText() {
        return currentText;
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }


    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public void setValue5(int value5) {
        this.value5 = value5;
    }

    public void setValue6(int value6) {
        this.value6 = value6;
    }

    public void setValue7(int value7) {
        this.value7 = value7;
    }

    public void setValue8(int value8) {
        this.value8 = value8;
    }

    public void setValue9(int value9) {
        this.value9 = value9;
    }

    public void setValue0(int value0) {
        this.value0 = value0;
    }

    public void setValueDot(String valueDot) {
        this.valueDot = valueDot;
    }

    public void setValueC(String valueC) {
        this.valueC = valueC;
    }

    public void setValuePlus(String valuePlus) {
        this.valuePlus = valuePlus;
    }

    public void setValueEqually(String valueEqually) {
        this.valueEqually = valueEqually;
    }

    public void setValuePercent(String valuePercent) {
        this.valuePercent = valuePercent;
    }

    public void setValueMultiply(String valueMultiply) {
        this.valueMultiply = valueMultiply;
    }

    public void setValueDivide(String valueDivide) {
        this.valueDivide = valueDivide;
    }

    public void setValueSquare(String valueSquare) {
        this.valueSquare = valueSquare;
    }

    public void setValueMinus(String valueMinus) {
        this.valueMinus = valueMinus;
    }

    private String valueDot = "•";
    private String valueC = "С";
    private String valuePlus = "+";
    private String valueEqually = "=";
    private String valuePercent = "%";

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }

    public int getValue5() {
        return value5;
    }

    public int getValue6() {
        return value6;
    }

    public int getValue7() {
        return value7;
    }

    public int getValue8() {
        return value8;
    }

    public int getValue9() {
        return value9;
    }

    public int getValue0() {
        return value0;
    }

    public String getValueDot() {
        return valueDot;
    }

    public String getValueC() {
        return valueC;
    }

    public String getValuePlus() {
        return valuePlus;
    }

    public String getValueEqually() {
        return valueEqually;
    }

    public String getValuePercent() {
        return valuePercent;
    }

    public String getValueMultiply() {
        return valueMultiply;
    }

    public String getValueDivide() {
        return valueDivide;
    }

    public String getValueSquare() {
        return valueSquare;
    }

    public String getValueMinus() {
        return valueMinus;
    }

    private String valueMultiply = "*";
    private String valueDivide = "÷";
    private String valueSquare = "√¯";
    private String valueMinus = "-";
}
