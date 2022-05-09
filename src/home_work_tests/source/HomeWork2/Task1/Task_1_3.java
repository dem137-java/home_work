package home_work_tests.source.HomeWork2.Task1;

public class Task_1_3 {
    private String result="";

    public String getPowerString(double number,int power){
        if (power<0){
            return "Степень не может быть отрицательной";
        } else {
            double calculation=1;
            for (int i=0;i<power;i++){
                calculation*=number;
            }
            result=number+" ^ "+power+" = "+calculation;
            return result;
        }
    }
}
