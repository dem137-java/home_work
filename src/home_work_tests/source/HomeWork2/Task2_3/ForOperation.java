package home_work_tests.source.HomeWork2.Task2_3;

public class ForOperation implements IArraysOperation {

    private StringBuilder builder = new StringBuilder();
    private String result="";

    @Override
    public String arrayPrintAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i != arr.length - 1) {
                builder.append(" ");
            }
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintSecond(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            builder.append(arr[i]);
            if (i != arr.length - 1) {
                builder.append(" ");
            }
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]);
            if (i != 0) {
                builder.append(" ");
            }
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }
}
