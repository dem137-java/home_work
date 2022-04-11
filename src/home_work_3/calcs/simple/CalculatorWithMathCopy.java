package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * метод возвращает результат деления числа a на число b
     * @param a число a
     * @param b число b
     * @return результат деления
     */
    public double divide(double a, double b) {
        double c = a / b;
        return c;
    }

    /**
     * метод возвращает результат умножения числа a на число b
     * @param a число a
     * @param b число b
     * @return результат умножения
     */
    public double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    /**
     * метод возвращает результат сложения числа a и числа b
     * @param a число a
     * @param b число b
     * @return результат сложения
     */
    public double add(double a, double b) {
        double c = a + b;
        return c;
    }

    /**
     * метод возвращает результат вычитания числа b из числа a
     * @param a число a
     * @param b число b
     * @return результат вычитания
     */
    public double deduct(double a, double b) {
        double c = a - b;
        return c;
    }

    /**
     * метод возвращает результат возведения в степень b положительного числа a
     * с использованием библиотеки класса Math
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        return Math.pow(a,b);
    }

    /**
     * метод возвращает модуль числа a
     * с использованием библиотеки класса Math
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        return Math.abs(a);
    }

    /**
     * метод возвращает квадратный корень из числа a
     * с использованием библиотеки класса Math
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}