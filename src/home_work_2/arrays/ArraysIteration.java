package home_work_2.arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        int [] container = ArraysUtils.arrayFromConsole();
        arrayPrintAll(container);
        arrayPrintSecond(container);
        arrayPrintReverse(container);
    }

    public static void arrayPrintAll(int[]arr){
        //перебор массива оператором for
        System.out.println("\nfor");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //перебор массива оператором for each
        System.out.println("\nfor each");
        for (int i :arr) {
            System.out.print(i+" ");
        }
        //перебор массива оператором while
        System.out.println("\nwhile");
        int i=0;
        while (i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
        //перебор массива оператором do while
        System.out.println("\ndo while");
        i=0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        }
        while (i<arr.length);
    }

    public static void arrayPrintSecond(int[]arr){
        //перебор массива оператором for
        System.out.println("\nfor");
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i]+" ");
        }
        //перебор массива оператором for each
        System.out.println("\nfor each");
        int i=0;
        for (int j :arr) {
            if (i==0||i%2==0){
                System.out.print(j + " ");
            }
            i++;
        }
        //перебор массива оператором while
        System.out.println("\nwhile");
        i=0;
        while (i<arr.length) {
            if (i==0||i%2==0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }
        //перебор массива оператором do while
        System.out.println("\ndo while");
        i=0;
        do {
            if(i==0||i%2==0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }
        while (i<arr.length);
    }

    public static void arrayPrintReverse(int[]arr){
        //перебор массива оператором for
        System.out.println("\nfor");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        //перебор массива оператором for each
        System.out.println("\nfor each");
        String reverse ="";
        for (int i :arr) {
            reverse =i+" "+reverse;
        }
        System.out.print(reverse);

        //перебор массива оператором while
        System.out.println("\nwhile");
        int i=arr.length-1;
        while (i>=0) {
            System.out.print(arr[i]+" ");
            i--;
        }
        //перебор массива оператором do while
        System.out.println("\ndo while");
        i=arr.length-1;
        do {
            System.out.print(arr[i]+" ");
            i--;
        }
        while (i>=0);
    }


}
