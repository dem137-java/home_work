package home_work_3.calcs.simple;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends{
    private long countOperations;

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
        return super.divide(a,b);
    }

    /**
     * метод возвращает результат умножения числа a на число b
     * @param a число a
     * @param b число b
     * @return результат умножения
     */
    public double multiply(double a, double b) {
        countOperations++;
        return super.multiply(a,b);
    }

    /**
     * метод возвращает результат сложения числа a и числа b
     * @param a число a
     * @param b число b
     * @return результат сложения
     */
    public double add(double a, double b) {
        countOperations++;
        return super.add(a,b);
    }

    /**
     * метод возвращает результат вычитания числа b из числа a
     * @param a число a
     * @param b число b
     * @return результат вычитания
     */
    public double deduct(double a, double b) {
        countOperations++;
        return super.deduct(a,b);
    }

    /**
     * метод возвращает результат возведения в степень b положительного числа a
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        countOperations++;
        return super.pow (a,b);
    }

    /**
     * метод возвращает модуль числа a
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        countOperations++;
        return super.abs(a);
    }

    /**
     * метод возвращает квадратный корень из числа a
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        countOperations++;
        return super.sqrt(a);
    }

}
