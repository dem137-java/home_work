package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());

        //1й способ - не используя метод занесения в память
        System.out.println(toCalc + calc.add(4.1,(calc.add(calc.multiply(15,7), calc.pow(calc.divide(28,5),2)))));

        //2й способ - используя метод занесения в память
        calc.divide(28,5);
        calc.setMemory();
        calc.pow(calc.getMemory(),2);
        calc.setMemory();
        calc.add(calc.multiply(15,7), calc.getMemory());
        calc.setMemory();
        calc.add(4.1, calc.getMemory());
        calc.setMemory();
        System.out.println(toCalc+calc.getMemory());
    }
}
