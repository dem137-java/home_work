package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        String toCalc = "4.1 + 15 * 7 + (28 / 5) ^ 2 = ";
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calc.add(4.1,(calc.add(calc.multiply(15,7), calc.pow(calc.divide(28,5),2))));
        System.out.println(toCalc + result);

        if (calc instanceof CalculatorWithCounterAutoDecorator){
            CalculatorWithCounterAutoDecorator calcDecor = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("количество операций: "+ (calcDecor.getCountOperations()));

            ICalculator tmpCalculator = calcDecor.getCalculator(); //большое спасибо за объяснение этой задачи!

            if (tmpCalculator instanceof CalculatorWithMemoryDecorator){
                ((CalculatorWithMemoryDecorator) tmpCalculator).setMemory();
                System.out.println(((CalculatorWithMemoryDecorator) tmpCalculator).getMemory());
            }
        }
    }
}
