package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        double result = calc3.add(4.1,(calc3.add(calc3.multiply(15,7), calc3.pow(28.0/5,2))));
        System.out.println(toCalc + result);
    }
}
