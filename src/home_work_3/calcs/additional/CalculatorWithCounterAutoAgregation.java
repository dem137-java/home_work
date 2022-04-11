package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    private long countOperations;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator someCalc){
        calc1 = someCalc;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy someCalc){
        calc2 = someCalc;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends someCalc){
        calc3 = someCalc;
    }

    public long getCountOperations() {
        return countOperations;
    }

    /**
     * метод возвращает результат деления числа a на число b
     * @param a число a
     * @param b число b
     * @return результат деления
     */
    public double divide(double a, double b) {
        countOperations++;
        if (calc1!=null){
            return calc1.divide(a,b);
        } else if (calc2!=null){
            return calc2.divide(a,b);
        } else {
            return calc3.divide(a,b);
        }
    }

    /**
     * метод возвращает результат умножения числа a на число b
     * @param a число a
     * @param b число b
     * @return результат умножения
     */
    public double multiply(double a, double b) {
        countOperations++;
        if (calc1!=null){
            return calc1.multiply(a,b);
        } else if (calc2!=null){
            return calc2.multiply(a,b);
        } else {
            return calc3.multiply(a,b);
        }
    }

    /**
     * метод возвращает результат сложения числа a и числа b
     * @param a число a
     * @param b число b
     * @return результат сложения
     */
    public double add(double a, double b) {
        countOperations++;
        if (calc1!=null){
            return calc1.add(a,b);
        } else if (calc2!=null){
            return calc2.add(a,b);
        } else {
            return calc3.add(a,b);
        }
    }

    /**
     * метод возвращает результат вычитания числа b из числа a
     * @param a число a
     * @param b число b
     * @return результат вычитания
     */
    public double deduct(double a, double b) {
        countOperations++;
        if (calc1!=null){
            return calc1.deduct(a,b);
        } else if (calc2!=null){
            return calc2.deduct(a,b);
        } else {
            return calc3.deduct(a,b);
        }
    }

    /**
     * метод возвращает результат возведения в степень b положительного числа a
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        countOperations++;
        if (calc1!=null){
            return calc1.pow(a,b);
        } else if (calc2!=null){
            return calc2.pow(a,b);
        } else {
            return calc3.pow(a,b);
        }
    }

    /**
     * метод возвращает модуль числа a
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        countOperations++;
        if (calc1!=null){
            return calc1.abs(a);
        } else if (calc2!=null){
            return calc2.abs(a);
        } else {
            return calc3.abs(a);
        }
    }

    /**
     * метод возвращает квадратный корень из числа a (без использования библиотеки Math)
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        countOperations++;
        if (calc1!=null){
            return calc1.sqrt(a);
        } else if (calc2!=null){
            return calc2.sqrt(a);
        } else {
            return calc3.sqrt(a);
        }
    }

}
