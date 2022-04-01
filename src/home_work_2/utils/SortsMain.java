package home_work_2.utils;

import home_work_2.arrays.ArraysUtils;

public class SortsMain {
    public static void main(String[] args) {

        //тестируем пузырьковую сортировку
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        testBubbleSort(array1);

        int[] array2 = new int[]{1, 1, 1, 1};
        testBubbleSort(array2);

        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        testBubbleSort(array3);

        int[] array4 = new int[]{};
        testBubbleSort(array4);

        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
        testBubbleSort(array5);

        int[] array6 = ArraysUtils.arrayRandom(50, 100);
        testBubbleSort(array6);

        int[] array7 = ArraysUtils.arrayFromConsole();
        testBubbleSort(array7);

        //тестируем шейкерную сортировку
        array1 = new int[]{1, 2, 3, 4, 5, 6};
        testShakerSort(array1);

        array2 = new int[]{1, 1, 1, 1};
        testShakerSort(array2);

        array3 = new int[]{9, 1, 5, 99, 9, 9};
        testShakerSort(array3);

        array4 = new int[]{};
        testShakerSort(array4);

        array5 = new int[]{6, 5, 4, 3, 2, 1};
        testShakerSort(array5);

        array6 = ArraysUtils.arrayRandom(50, 100);
        testShakerSort(array6);

        array7 = ArraysUtils.arrayFromConsole();
        testShakerSort(array7);
    }

    /**
     * метод сортирует переданный массив пузырьковым методом и выводит результат сортировки в заданном формате
     * [Какой массив был до сортировки] -> [Каким стал массив после сортировки]
     * @param arr - одномерный массив значений типа int
     */
    public static void testBubbleSort(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("] -> ");
        SortsUtils.bubble(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    /**
     * метод сортирует переданный массив шейкерным методом и выводит результат сортировки в заданном формате
     * [Какой массив был до сортировки] -> [Каким стал массив после сортировки]
     * @param arr - одномерный массив значений типа int
     */
    public static void testShakerSort(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("] -> ");
        SortsUtils.shake(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}

