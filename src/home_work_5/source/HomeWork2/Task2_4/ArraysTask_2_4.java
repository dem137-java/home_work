package home_work_5.source.HomeWork2.Task2_4;

import home_work_2.arrays.ArraysUtils;

public class ArraysTask_2_4 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5, 99);
        printArray(container);
        System.out.println(getSumEvenPositiveElements(container));
        System.out.println(getMaxOfEvenIndex(container));
        getIndexLessThanArithmetics(container);
        getTwoMinElements(container);
        printArray(getCompressedArray(container,0,50));
        System.out.println(getSumOfArrayFigures(container));
    }

    public static int getSumEvenPositiveElements(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                result += arr[i];
            }
        }
        return result;
    }

    public static int getMaxOfEvenIndex(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( i % 2 == 0) {
                if (arr[i] > result) {
                    result = arr[i];
                }
            }
        }
        return result;
    }

    public static int[] getIndexLessThanArithmetics(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int arithmetic =sum/arr.length;
        System.out.println("Среднее арифметическое: "+arithmetic);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arithmetic){
                count++;
                System.out.print(i+" ");
            }
        }
        int [] arr2 = new int[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arithmetic){
                arr2[j]=i;
                j++;
            }
        }
        return arr2;
    }

    public static int[] getTwoMinElements(int[] arr) {
        if (arr.length<2){
            System.out.println("Введенная длина массива не соответствует условиям задачи");
            return new int[]{};
        }
        int min1 = arr[0];
        int min2 = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] <= min1) {
                if (arr[i] <= min2) {
                    if (min1<min2){
                        min2=arr[i];
                    } else {
                        min1 = arr[i];}
                } else {
                    min1 = arr[i];
                }
            }
        }
        return new int[]{min1, min2};
    }

    public static int getSumOfArrayFigures (int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]=Math.abs(arr[i]);
            }
            int num = arr[i];
            while (num!=0){
                sum += num%10;
                num /= 10;
            }
        }
            return sum;
    }

    public static int[] getCompressedArray(int[]arr, int start,int end){
        int newLength = arr.length;                 // переменная длины нового массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=end&&arr[i]>=start){
                newLength-=1;
            }
        }
        int [] result = new int[newLength];         //создаем новый массив
        int j=0;                                    //счетчик индекса нового массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>end||arr[i]<start) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }


    //вспомогательный метод для печати массивов
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
