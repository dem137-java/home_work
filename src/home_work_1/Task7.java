package home_work_1;

import java.util.Scanner;

public class Task7 {

    public static String code;

    public static String toBinaryString(byte number) {
        if (number > 0) {
            code = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');

        } else {
            code = Integer.toBinaryString(number).substring(24);

        }
        return code;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        byte number = console.nextByte();
        System.out.println(toBinaryString(number));
    }
}
