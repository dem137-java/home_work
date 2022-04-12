package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        double result = calc.add(4.1,(calc.add(calc.multiply(15,7), calc.pow(calc.divide(28,5),2))));
        System.out.println(toCalc + result);
    }
}
