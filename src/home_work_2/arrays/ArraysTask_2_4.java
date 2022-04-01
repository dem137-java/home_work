package home_work_2.loops;

public class ArraysTask_2_4 {
    public static void main(String[] args) {
        int[] container = home_work_2.loops.ArraysUtils.arrayRandom(5, 99);
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
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i % 2 == 0) {
                if (arr[i] > result) {
                    result = arr[i];
                }
            }
        }
        return result;
    }

    public static void getIndexLessThanArithmetics(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int arithmetic =sum/arr.length;
        System.out.println("Среднее арифметическое: "+arithmetic); // для удобства тестирования программы, можно удалить
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arithmetic){
                System.out.print(i+" ");
            }
        }
    }

    public static void getTwoMinElements(int[] arr) {
        if (arr.length<2){
            System.out.println("Введенная длина массива не соответствует условиям задачи");
            System.exit(0);
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
        System.out.println("\n"+min1 + " " + min2);
    }

    public static int getSumOfArrayFigures (int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num>0){
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
            if (arr[i]>=end||arr[i]<=start) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
