package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();
        double result = calc4.add(4.1,(calc4.add(calc4.multiply(15,7), calc4.pow(28.0/5,2))));
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        System.out.println(toCalc + result);
        System.out.println("количество операций: "+calc4.getCountOperations());
    }
}
