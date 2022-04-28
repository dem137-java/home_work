package home_work_2.arrays.task2_3;

public class DoWhileOperation implements IArraysOperation{

    @Override
    public void arrayPrintAll(int[] arr) {
            int i=0;
            do {
                System.out.print(arr[i]+" ");
                i++;
            }
            while (i<arr.length);
    }

    @Override
    public void arrayPrintSecond(int[] arr) {
        int i=0;
        do {
            if(i==0||i%2==0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }
        while (i<arr.length);
    }

    @Override
    public void arrayPrintReverse(int[] arr) {
        int i=arr.length-1;
        do {
            System.out.print(arr[i]+" ");
            i--;
        }
        while (i>=0);
    }
}
