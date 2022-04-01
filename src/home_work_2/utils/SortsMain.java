package home_work_2.utils;

import home_work_2.arrays.ArraysUtils;

public class SortsMain {
    public static void main(String[] args) {

        //тестируем пузырьковую сортировку
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        printInitArray(array1);
        SortsUtils.bubble(array1);
        printSortedArray(array1);

        int[] array2 = new int[]{1, 1, 1, 1};
        printInitArray(array2);
        SortsUtils.bubble(array2);
        printSortedArray(array2);

        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        printInitArray(array3);
        SortsUtils.bubble(array3);
        printSortedArray(array3);

        int[] array4 = new int[]{};
        printInitArray(array4);
        SortsUtils.bubble(array4);
        printSortedArray(array4);

        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
        printInitArray(array5);
        SortsUtils.bubble(array5);
        printSortedArray(array5);

        int[] array6 = ArraysUtils.arrayRandom(50, 100);
        printInitArray(array6);
        SortsUtils.bubble(array6);
        printSortedArray(array6);

        int[] array7 = ArraysUtils.arrayFromConsole();
        printInitArray(array7);
        SortsUtils.bubble(array7);
        printSortedArray(array7);

        //тестируем шейкерную сортировку
        array1 = new int[]{1, 2, 3, 4, 5, 6};
        printInitArray(array1);
        SortsUtils.shake(array1);
        printSortedArray(array1);

        array2 = new int[]{1, 1, 1, 1};
        printInitArray(array2);
        SortsUtils.shake(array2);
        printSortedArray(array2);

        array3 = new int[]{9, 1, 5, 99, 9, 9};
        printInitArray(array3);
        SortsUtils.shake(array3);
        printSortedArray(array3);

        array4 = new int[]{};
        printInitArray(array4);
        SortsUtils.shake(array4);
        printSortedArray(array4);

        array5 = new int[]{6, 5, 4, 3, 2, 1};
        printInitArray(array5);
        SortsUtils.shake(array5);
        printSortedArray(array5);

        array6 = ArraysUtils.arrayRandom(50, 100);
        printInitArray(array6);
        SortsUtils.shake(array6);
        printSortedArray(array6);

        array7 = ArraysUtils.arrayFromConsole();
        printInitArray(array7);
        SortsUtils.bubble(array7);
        printSortedArray(array7);
    }

// ниже 2 метода для распечатки массивов в заданном формате
    public static void printInitArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("] -> ");
    }
    public static void printSortedArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("] ");


    }
}
