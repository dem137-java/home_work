package home_work_2.utils;

public class SortsUtils {

    public static void bubble(int[] arr){
        for (int i=0;i < arr.length-1;i++){
            for (int j = arr.length-1;j>i;j--){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void shake(int[] arr){
        int left = 0;                       //левая граница
        int right = arr.length-1;           //правая граница

        do {
            //сдвигаем к концу массива максимальные значения
            for (int i=left;i < right;i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            right--;                        //сдвигаем правую границу

            //сдвигаем к началу массива минимальные значения
            for (int i=right; i>left; i--) {
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            left++;                        //сдвигаем левую границу
        } while(left<=right);
    }
}
