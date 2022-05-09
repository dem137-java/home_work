package home_work_tests.source.HomeWork2.Task2_3;

public class ForEachOperation implements IArraysOperation {

    private StringBuilder builder = new StringBuilder();
    private String result = "";

    @Override
    public String arrayPrintAll(int[] arr) {
        for (int i : arr) {
            builder.append(i);
            if (i != arr.length) {
                builder.append(" ");
            }
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintSecond(int[] arr) {
        int i=0;
        for (int j :arr) {
            if (i % 2 == 0){
                builder.append(arr[i]);
                if (i != arr.length - 1) {
                    builder.append(" ");
                }
            }
            i++;
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintReverse(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i :arr) {
            builder.append(i);
            if (i != arr.length ) {
                builder.append(" ");
            }
        }
        result=builder.reverse().toString();
        builder.delete(0,builder.length());
        return result;
    }
}
