package home_work_2.arrays.task2_3;

public class ForEachOperation implements IArraysOperation{

    @Override
    public void arrayPrintAll(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void arrayPrintSecond(int[] arr) {
        int i=0;
        for (int j :arr) {
            if (i % 2 == 0){
                System.out.print(j + " ");
            }
            i++;
        }
    }

    @Override
    public void arrayPrintReverse(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i :arr) {
            builder.append(i);
        }
        System.out.print(builder.reverse());
    }
}
