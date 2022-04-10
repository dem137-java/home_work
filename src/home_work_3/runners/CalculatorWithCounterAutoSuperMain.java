package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();
        double result = calc5.add(4.1,(calc5.add(calc5.multiply(15,7), calc5.pow(28.0/5,2))));
        System.out.println(toCalc + result);
        System.out.println("количество операций: "+ calc5.getCountOperations());
    }
}

