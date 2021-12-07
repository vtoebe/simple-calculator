package com.vtoebe.calculator.utils;

public class Writer {

    public float saveFirstNum(String num) {
        return Float.parseFloat(num);
    }
    public float saveSecondNum(String num) {
        return Float.parseFloat(num);
    }

    public String sumResult(float sumResult){
        return "Sum: " + sumResult + "\n";
    }
    public String subResult(float subResult){
        return "Subtraction : " + subResult + "\n";
    }
    public String multResult(float multResult){
        return "Multiplication: " + multResult + "\n";
    }
    public String divResult(Float divResult){ return divResult == null? "Can't divide by zero!" : "Sum: " + divResult + "\n"; }
}
