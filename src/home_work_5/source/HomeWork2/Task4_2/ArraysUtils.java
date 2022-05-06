package home_work_5.source.HomeWork2.Task4_2;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * метод запрашивает у пользователя через консоль размер одномерного массива, а также каждое значение масива, создает массив и помещает значения в ячейки
     * @return возвращает одномерный массив значений int заданной пользователем длины и значений
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = console.nextInt();
        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным целым числом!");
            System.out.print("Введите размер массива: ");
            size = console.nextInt();
        }
        int []container = new int[size];
        System.out.print("Введите " +size + " чисел: ");
        for (int i = 0; i < size; i++) {
                container[i] = console.nextInt();
            }
        return container;
    }

    /**
     * метод создает одномерный массив заданной аргументом size длины и заполняет ячейки массива случайными числами от 0 до maxValueExclusion (исключая)
     * @param size - длина одномерного массива (int)
     * @param maxValueExclusion - максимальное значение ячейки массива (исключая) (int)
     * @return - одномерный массив с длиной size и случайными значениями в ячейках
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        if (size <= 0) {
            System.out.print("Размер массива должен быть положительным целым числом!");
            System.out.print("Размер массива будет установлен случайным от 0 до 50");
            Random rnd = new Random();
            size = rnd.nextInt(50);
        }
        int[]arrRand = new int[size];  //создание массива необходимого размера
            for (int i = 0; i < size; i++) {
                Random rnd = new Random();
                arrRand [i] = rnd.nextInt(maxValueExclusion);
                }
            return arrRand;
    }

}


