package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    /**
     * метод возвращает результат деления числа a на число b
     *
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
     *
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
     *
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
     *
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
     *
     * @param a число a
     * @param b степень
     * @return результат возведения в степень
     */
    public double pow(double a, int b) {
        if (b == 0) {
            return 1.00;
        } else {
            double c = 1;
            for (int i = 0; i < b; i++) {
                c *= a;
            }
            return c;
        }
    }

    /**
     * метод возвращает модуль числа a
     *
     * @param a число a
     * @return модуль числа а
     */
    public double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    /**
     * метод возвращает квадратный корень из числа a (без использования библиотеки Math)
     * @param a число a
     * @return квадратный корень из числа a
     */
    public double sqrt(double a){
        double num;
        double half = a / 2;
        do {
            num = half;
            half = (num + (a / num)) / 2;
        } while ((num - half) != 0);
        return half;
    }

//    public double sqrt22(double a) {
//        double root = 0.00000001;
//        while (root * root <= a) root+=0.00000001;
//        root-=0.00000001;
//        DecimalFormat df = new DecimalFormat("#.#######");
//        return Double.parseDouble(df.format(root));
//    }

}





