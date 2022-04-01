package home_work_2.arrays;

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
            System.out.print("Размер массива должен быть положительным целым числом!");
            System.exit(0);
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
     * @param size - длина одномерного массива
     * @param maxValueExclusion - максимальное значение ячейки массива (исключая)
     * @return - одномерны массив с длиной size и случайными значениями в ячейках
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        if (size <= 0) {
            System.out.print("Размер массива должен быть положительным целым числом!");
            System.exit(0);
        }
        int[]arrRand = new int[size];  //создание массива необходимого размера
            for (int i = 0; i < size; i++) {
                Random rnd = new Random();
                arrRand [i] = rnd.nextInt(maxValueExclusion);
                }
            return arrRand;
    }

}


