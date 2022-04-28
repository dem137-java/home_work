package home_work_2.arrays.task2_3;

public class ForOperation implements IArraysOperation {

    @Override
    public void arrayPrintAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void arrayPrintSecond(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void arrayPrintReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
