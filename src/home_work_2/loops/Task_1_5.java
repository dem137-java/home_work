package home_work_2.loops;

public class Task_1_5 {
    public static void main(String[] args) {

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
