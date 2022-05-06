package home_work_5.source.HomeWork2.Task1;

public class Task_1_5 {
    public static void tablePrint() {

        for (int i = 1; i <= 10; i++) {
            for (int j=2; j<=5;j++){
                if (i==10){
                    System.out.printf("%d x %d= %d\t",j,i,j*i);
                }else {
                    System.out.printf("%d x %d = %d\t",j,i,j*i);
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            for (int j=6; j<=9;j++){
                if (i==10){
                    System.out.printf("%d x %d= %d\t",j,i,j*i);
                }else {
                    System.out.printf("%d x %d = %d\t",j,i,j*i);
                }
            }
            System.out.println("");
        }
    }
}
