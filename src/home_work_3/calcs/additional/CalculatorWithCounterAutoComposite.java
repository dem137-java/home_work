package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperations;
    private CalculatorWithOperator calc1;

    public CalculatorWithCounterAutoComposite(){
        this.calc1 = new CalculatorWithOperator();
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
        return calc1.divide(a,b);
    }

    /**
     * метод возвращает результат умножения числа a на число b
     * @param a число a
     * @param b число b
     * @return результат умножения
     */
    public double multiply(double a, double b) {
        countOperations++;
        return calc1.multiply(a,b);
    }

    /**
     * метод возвращает результат сложения числа a и числа b
     * @param a число a
     * @param b число b
     * @return результат сложения
     */
    public double add(double a, double b) {
        countOperations++;
        return calc1.add(a,b);
    }

    /**
     * метод возвращает результат вычитания числа b из числа a
     * @param a число a
     * @param b число b
     * @return результат вычитания
     */
    public double deduct(double a, double b) {
        countOperations++;
        return calc1.deduct(a,b);
    }

    /**
     * метод возвращает результат возведения в степень b положительного числа a
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        countOperations++;
        return calc1.pow(a,b);
    }

    /**
     * метод возвращает модуль числа a
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        countOperations++;
        return calc1.abs(a);
    }

    /**
     * метод возвращает квадратный корень из числа a (без использования библиотеки Math)
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        countOperations++;
        return calc1.sqrt(a);
    }
}