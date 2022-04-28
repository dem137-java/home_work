package home_work_2.arrays.task2_3;

public class WhileOperation implements IArraysOperation{

    @Override
    public void arrayPrintAll(int[] arr) {
        int i=0;
        while (i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    @Override
    public void arrayPrintSecond(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (i==0||i%2==0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }
    }

    @Override
    public void arrayPrintReverse(int[] arr) {
        int i=arr.length-1;
        while (i>=0) {
            System.out.print(arr[i]+" ");
            i--;
        }
    }
}
