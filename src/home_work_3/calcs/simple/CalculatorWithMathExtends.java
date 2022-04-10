package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

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
