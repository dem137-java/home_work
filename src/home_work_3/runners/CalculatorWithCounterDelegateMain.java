package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";

        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();
        double result = calcComposite.add(4.1,(calcComposite.add(calcComposite.multiply(15,7), calcComposite.pow(28.0/5,2))));
        System.out.println(toCalc + result);

        CalculatorWithCounterAutoAgregation calcAgregation = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        result = calcAgregation.add(4.1,(calcAgregation.add(calcAgregation.multiply(15,7), calcAgregation.pow(28.0/5,2))));
        System.out.println(toCalc + result);


    }
}
