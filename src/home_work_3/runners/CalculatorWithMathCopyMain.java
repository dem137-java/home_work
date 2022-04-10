package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        double result = calc2.add(4.1,(calc2.add(calc2.multiply(15,7), calc2.pow(28.0/5,2))));
        System.out.println(toCalc + result);
    }
}
