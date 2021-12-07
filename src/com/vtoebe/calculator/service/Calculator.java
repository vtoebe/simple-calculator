package com.vtoebe.calculator.service;

public class Calculator {
    public float sum(float firstNum, float secondNum){
        return firstNum + secondNum;
    }
    public float sub(float firstNum, float secondNum){
        return firstNum - secondNum;
    }
    public float mult(float firstNum, float secondNum){
        return firstNum * secondNum;
    }
    public Float div(float firstNum, float secondNum){ return secondNum == 0 ? null : firstNum / secondNum; }
}
