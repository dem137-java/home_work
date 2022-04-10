package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result = calc.add(4.1,(calc.add(calc.multiply(15,7), calc.pow(28.0/5,2))));
        System.out.println(result);
    }
}
