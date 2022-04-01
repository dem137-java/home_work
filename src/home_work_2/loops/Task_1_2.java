package home_work_2.loops;

public class Task_1_2 {
    public static void main(String[] args) {
        String strArgument = args[0];
        if (strArgument.matches("\\d*+$")){
            getMultiplication(strArgument);
        } else if (strArgument.matches("\\d*[.,]\\d+$")){
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }
    }

    public static void getMultiplication(String arg){
        long number = Long.parseLong(arg);
        long result=1;                                      //переменная для хранения произведения цифр
        String resultStepByStep="";                         //переменная для хранения текста умножения
        for (int i = arg.length();i>=1;i--){
            result *= number%10;
            if (i==1){
                resultStepByStep=number%10+" * "+resultStepByStep+" = "+result;
            } else if (i==arg.length()){
                resultStepByStep=number%10+" ";
            } else {
                resultStepByStep = number % 10 + " * " + resultStepByStep;
            }
            number/=10;
        }
        System.out.print(resultStepByStep);
    }
}
