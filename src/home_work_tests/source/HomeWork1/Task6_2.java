package home_work_tests.source.HomeWork1;

import java.util.Scanner;

public class Task6_2 {

    public static int[]numbers=new int [10];

    public static String createPhoneNumber(int[]array){
        String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d",array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8],array[9]);
        return phoneNumber;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 10 цифр от 0 до 9: ");
        for (int i=0;i<numbers.length;i++){
            numbers[i] = console.nextInt();
        }
        System.out.println(createPhoneNumber(numbers));






    }
}
