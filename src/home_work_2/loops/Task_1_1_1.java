package home_work_2.loops;

public class Task_1_1_1 {
    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);
        long amount=1;
        String result="";

        if (number<=0){
            System.out.println("Введенное число меньше либо равно 0 и не соответсвует условиям задания");
        } else if (number>Long.MAX_VALUE){
            System.out.println("Введеное число превышает допустимый диапазон значений");
        } else if (number==1){
            amount *= number;
            result += number + "*1=" + amount;
        }else {
            for (long i=1;i<=number;i++) {
                if (i<number){
                    result += i+"*";
                    amount *= i;
                } else{
                    amount *= i;
                    result += i+"="+amount;
                }
                if (amount<=0){
                    System.out.println("Извините, не могу посчитать такое большое число, в следующий раз попробуйте ввести число поменьше");
                    System.exit(0);
                }
            }
        }
        System.out.println(result);
    }
}
