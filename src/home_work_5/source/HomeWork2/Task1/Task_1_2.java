package home_work_5.source.HomeWork2.Task1;

public class Task_1_2 {
    public String job (String number) {
        if (number.matches("\\d*+$")){
            return getMultiplication(number);
        } else if (number.matches("\\d*[.,]\\d+$")){
            return "Введено не целое число";
        } else {
            return"Введено не число";
        }
    }

    public String getMultiplication(String arg){
        long number = Long.parseLong(arg);
        long result=1;                                      //переменная для хранения произведения цифр
        String resultStepByStep="";                         //переменная для хранения текста умножения
        for (int i = arg.length();i>=1;i--){
            result *= number%10;
            if (i==1){
                resultStepByStep=number%10+" * "+resultStepByStep+" = "+result;
            } else if (i==arg.length()){
                resultStepByStep= String.valueOf(number%10);
            } else {
                resultStepByStep = number % 10 + " * " + resultStepByStep;
            }
            number/=10;
        }
        return resultStepByStep;
    }
}
