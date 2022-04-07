package home_work_2.loops;

public class Task_1_4 {
    public static void main(String[] args) {

        long a = 1;
        long multiplicator1 = 3;
        long multiplicator2=188;
        long multiplicator3=-19;

        //ниже алгоритм для умножения на 3
        //опытным путем узнаем сколько итераций нужно для переполнения
        for (long i = 0; i <= 40; i++) {
            a *= multiplicator1;
            System.out.println(a+" "+i); // переполнение происходит на 39 итерации
        }
        a=1;
        for (long i = 0; i <= 39; i++) {
            a *= multiplicator1;
            if (i==38){
                System.out.println("значение до переполнения: "+a);
            }
            if (i==39){
                System.out.println("значение после переполнения: "+a);
            }
        }

        //ниже алгоритм для умножения на 188
        //опытным путем узнаем сколько итераций нужно для переполнения
        a=1;
        for (long i = 0; i <= 10; i++) {
            a *= multiplicator2;
            System.out.println(a+" "+i); // переполнение происходит на 8 итерации
        }
        a=1;
        for (long i = 0; i <= 8; i++) {
            a *= multiplicator2;
            if (i==7){
                System.out.println("значение до переполнения: "+a);
            }
            if (i==8){
                System.out.println("значение после переполнения: "+a);
            }
        }


    }
}
