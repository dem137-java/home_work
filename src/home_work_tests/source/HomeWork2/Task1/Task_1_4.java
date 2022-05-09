package home_work_tests.source.HomeWork2.Task1;

public class Task_1_4 {
    public void getOverloaded () {

        long a = 1;
        long multiplicator1 = 3;
        long multiplicator2 = 188;
        long multiplicator3 = -19;
        //Scanner console = new Scanner(System.in);
        //System.out.println("Введите число для умножения: ");
        //long multiplyConsole = console.nextLong();

        //ниже алгоритм для умножения на 3
        //опытным путем узнаем сколько итераций нужно для переполнения
        for (long i = 0; i <= 40; i++) {
            a *= multiplicator1;
            System.out.println(a + " " + i); // переполнение происходит на 39 итерации
        }
        a = 1;
        for (long i = 0; i <= 39; i++) {
            a *= multiplicator1;
            if (i == 38) {
                System.out.println("значение до переполнения: " + a);
            }
            if (i == 39) {
                System.out.println("значение после переполнения: " + a);
            }
        }

        //ниже алгоритм для умножения на 188
        //опытным путем узнаем сколько итераций нужно для переполнения
        a = 1;
        for (long i = 0; i <= 10; i++) {
            a *= multiplicator2;
            System.out.println(a + " " + i); // переполнение происходит на 8 итерации
        }
        a = 1;
        for (long i = 0; i <= 8; i++) {
            a *= multiplicator2;
            if (i == 7) {
                System.out.println("значение до переполнения: " + a);
            }
            if (i == 8) {
                System.out.println("значение после переполнения: " + a);
            }
        }
        //ниже алгоритм для умножения на -19
        //опытным путем узнаем сколько итераций нужно для переполнения
        a = 1;
        for (long i = 0; i <= 20; i++) {
            a *= multiplicator3;
            System.out.println(a + " " + i); // переполнение происходит на 8 итерации
        }
        a = 1;
        for (long i = 0; i <= 14; i++) {
            a *= multiplicator3;
            if (i == 13) {
                System.out.println("значение до переполнения: " + a);
            }
            if (i == 14) {
                System.out.println("значение после переполнения: " + a);
            }
        }
    }
}

// над этим еще подумаю )))
//    public static long multiplyExact(long x, long y) {
//        long r = x * y;
//        long ax = Math.abs(x);
//        long ay = Math.abs(y);
//        if (((ax | ay) >>> 31 != 0)) {
//            if (((y != 0) && (r / y != x)) || (x == Long.MIN_VALUE && y == -1)) {
//                throw new ArithmeticException("long overflow");
//            }
//        }
//        return r;
//    }


