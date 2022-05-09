package home_work_tests.source.HomeWork2.Task1;

public class Task_1_1_2 {

    public long recursion1(long n) {
        long amount = 1;
        if (n == 0) {
            System.out.println("Введенное число меньше либо равно 0 и не соответствует условиям задания");
            return 0;
        }
        if (n < 0) {
            System.out.println("Введенное число будет принято без учета отрицательного знака");
            n=Math.abs(n);
        }
        System.out.print(n);
        if (n == 1) {
            System.out.print("=");
            return amount;
        }
        if (n != 1) {
            System.out.print("*");
        }
        amount = n * recursion1(n - 1);
        return amount;
    }

    public String recursion2(long number) {
        if (recursion1(number)<0) {
            return ("Извините, не могу посчитать такое число, в следующий раз попробуйте ввести число поменьше");
        }else {
            return String.valueOf(recursion1(number));
        }
}
}