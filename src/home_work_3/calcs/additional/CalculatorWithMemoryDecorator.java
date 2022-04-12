package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private long countOperations;
    private ICalculator calc;
    private double memory;
    private double lastResult;

    public CalculatorWithMemoryDecorator(ICalculator someCalc){
        calc = someCalc;
    }
    public long getCountOperations() {
        return countOperations;
    }
    public ICalculator getCalculator(){
        return calc;
    }

    /**
     * метод возвращает значение из памяти калькулятора, обнуляя при этом значение в памяти
     * @return хранящееся значение в памяти
     */
    public double getMemory() {
        double memoryTemp=memory;
        memory=0;
        return memoryTemp;
    }

    /**
     * метод записывает в память результат последней операции
     */
    public void setMemory() {
        this.memory = lastResult;
    }

    /**
     * метод возвращает результат деления числа a на число b
     * @param a число a
     * @param b число b
     * @return результат деления
     */
    public double divide(double a, double b) {
        countOperations++;
        lastResult=calc.divide(a,b);
        return lastResult;
    }

    /**
     * метод возвращает результат умножения числа a на число b
     * @param a число a
     * @param b число b
     * @return результат умножения
     */
    public double multiply(double a, double b) {
        countOperations++;
        lastResult=calc.multiply(a,b);
        return lastResult;
    }

    /**
     * метод возвращает результат сложения числа a и числа b
     * @param a число a
     * @param b число b
     * @return результат сложения
     */
    public double add(double a, double b) {
        countOperations++;
        lastResult=calc.add(a,b);
        return lastResult;
    }

    /**
     * метод возвращает результат вычитания числа b из числа a
     * @param a число a
     * @param b число b
     * @return результат вычитания
     */
    public double deduct(double a, double b) {
        countOperations++;
        lastResult=calc.deduct(a,b);
        return lastResult;
    }

    /**
     * метод возвращает результат возведения в степень b положительного числа a
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        countOperations++;
        lastResult=calc.pow(a,b);
        return lastResult;
    }

    /**
     * метод возвращает модуль числа a
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        countOperations++;
        lastResult=calc.abs(a);
        return lastResult;
    }

    /**
     * метод возвращает квадратный корень из числа a (без использования библиотеки Math)
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        countOperations++;
        lastResult=calc.sqrt(a);
        return lastResult;
    }
}
