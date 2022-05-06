package home_work_5.source.HomeWork2.Task1;

public class Task_1_1_1 {
    public static String multiply(long number) {
        long amount=1;
        String result="";
        if (number<=0){
            return "Введенное число меньше либо равно 0 и не соответствует условиям задания";
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
                    return "Извините, не могу посчитать такое большое число, в следующий раз попробуйте ввести число поменьше";
                }
            }
        }
        return result;
    }
}
