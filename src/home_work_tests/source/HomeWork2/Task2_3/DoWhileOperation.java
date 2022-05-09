package home_work_tests.source.HomeWork2.Task2_3;

public class DoWhileOperation implements IArraysOperation {

    private StringBuilder builder = new StringBuilder();
    private String result = "";
    @Override
    public String arrayPrintAll(int[] arr) {
            int i=0;
            do {
                builder.append(arr[i]);
                if (i!=arr.length-1) {
                    builder.append(" ");
                }
                i++;
            }
            while (i<arr.length);
            result=builder.toString();
            builder.delete(0,builder.length());
            return result;
    }

    @Override
    public String arrayPrintSecond(int[] arr) {
        int i=0;
        do {
            if(i==0||i%2==0) {
                builder.append(arr[i]);
                if (i!=arr.length-1) {
                    builder.append(" ");
                }
            }
            i++;
        }
        while (i<arr.length);
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintReverse(int[] arr) {
        int i=arr.length-1;
        do {
            builder.append(arr[i]);
            if (i!=0) {
                builder.append(" ");
            }
            i--;
        }
        while (i>=0);
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }
}
