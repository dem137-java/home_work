package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;

        int result1 = 5+b/a;
        System.out.println(result1);

        int result2 = (5+b)/a;
        System.out.println(result2);


        int result3 = (5+b++)/a;
        System.out.println(result3);
        b--;

        int result4 = (5+b++)/--a;
        System.out.println(result4);
        b--; ++a;

        int result5 = (5*b>>b++)/--a;
        System.out.println(result5);
        b--; ++a;

        int result6 = (5+7>20?68:22*2>>b++)/--a;
        System.out.println(result6);
        b--; ++a;

        //*int result7 = (5+7>20?68>=68:22*2>>b++)/--a; - РЕЗУЛЬТАТ ОШИБКА КОМПИЛЯЦИИ
        //System.out.println(result6);
        //b--; ++a;

        boolean result8 = 6-2>3&&12*12<=119;
        System.out.println(result8);

        boolean result9 = true&&false;
        System.out.println(result9);
    }
}
