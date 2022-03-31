package home_work_2.loops;

public class Task_1_1_2 {
    public static long number;
    public static long amount = 1;

    public static long recursion(long n) {
        if (n <= 0) {
            System.out.println("Введенное число меньше либо равно 0 и не соответсвует условиям задания");
            System.exit(0);
        }
        if (n > Long.MAX_VALUE) {
            System.out.println("Введеное число превышает допустимый диапазон значений");
            System.exit(0);

        }
        System.out.print(n);
        if (n == 1) {
            System.out.print("=");
            return amount;
        }
        if (n != 1) {
            System.out.print("*");
        }
        amount = n * recursion(n - 1);
        return amount;
    }

    public static void main(String[] args) {
        number = Long.parseLong(args[0]);
        if (recursion(number)<=0) {
            System.out.println("Извините, не могу посчитать такое большое число, в следующий раз попробуйте ввести число поменьше");
            System.exit(0);
        }else {
            System.out.print(amount);
        }
}
}