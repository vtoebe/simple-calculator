package com.vtoebe.calculator;

import com.vtoebe.calculator.service.ContinuityChecker;
import com.vtoebe.calculator.utils.Printer;
import com.vtoebe.calculator.utils.Writer;

public class Main {

    public static void main(String[] args){
        Printer print = new Printer();
        Writer write = new Writer();
        ContinuityChecker continuity = new ContinuityChecker();

        do{
           print.result(
                    write.saveFirstNum(print.firstNumberRequest()),
                    write.saveSecondNum(print.secondNumberRequest())
            );
        } while( continuity.check() );
    }
}
