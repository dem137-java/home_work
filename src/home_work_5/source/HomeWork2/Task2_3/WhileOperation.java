package home_work_5.source.HomeWork2.Task2_3;

public class WhileOperation implements IArraysOperation {

    private StringBuilder builder = new StringBuilder();
    private String result = "";

    @Override
    public String arrayPrintAll(int[] arr) {
        int i=0;
        while (i<arr.length) {
            builder.append(arr[i]);
            if (i!=arr.length-1){
                builder.append(" ");
            }
            i++;
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }

    @Override
    public String arrayPrintSecond(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (i==0||i%2==0) {
                builder.append(arr[i]);
                if (i!=arr.length-1){
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
        int i=arr.length-1;
        while (i>=0) {
            builder.append(arr[i]);
            if (i!=0){
                builder.append(" ");
            }
            i--;
        }
        result=builder.toString();
        builder.delete(0,builder.length());
        return result;
    }
}
