package com.vtoebe.calculator.utils;

import com.vtoebe.calculator.service.Calculator;

import javax.swing.JOptionPane;

public class Printer {
    final String FIRST_VALUE = "Type the first number: ";
    final String SECOND_VALUE = "Type the second number: ";
    final String CONTINUE_LINE = "Would you like to continue?";

    Writer write = new Writer();
    Calculator calc = new Calculator();

    public String firstNumberRequest(){ return JOptionPane.showInputDialog(null, FIRST_VALUE, "Calculator", JOptionPane.INFORMATION_MESSAGE); }
    public String secondNumberRequest(){ return JOptionPane.showInputDialog(null, SECOND_VALUE, "Calculator", JOptionPane.INFORMATION_MESSAGE); }

    public void result(float firstNum, float secondNum) {
        JOptionPane.showMessageDialog(null,
                write.sumResult(calc.sum(firstNum, secondNum)) +
                        write.subResult(calc.sub(firstNum, secondNum)) +
                        write.multResult(calc.mult(firstNum, secondNum)) +
                        write.divResult(calc.div(firstNum, secondNum)),
                "Results",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
}
