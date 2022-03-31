package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3 {
    static String result="";   //объявляем и инициализируем переменную для храннения окончательного текста для печати

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число для возведения в степень: ");
        Double number = console.nextDouble();   //получаем число из консоли типа double
        System.out.print("Введите степень: ");
        int power = console.nextInt();          //получаем целочисленное значение из консоли типа int
        if (power<0){                           //проверка на ввод отрицательного числа
            System.out.println("Степень не может быть отрицательной");
        } else {
            System.out.println(getPower(number, power));
        }
    }

    public static String getPower(double number, int power){
        double calculation=1;           //объявляем и инициализируем переменную для храннения результата произведения
        for (int i=0;i<power;i++){
            calculation*=number;
        }
        result=number+" ^ "+power+" = "+calculation;
        return result;
    }
}
