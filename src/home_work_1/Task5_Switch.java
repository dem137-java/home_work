package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_Switch {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = console.nextLine();

        switch (inputName){
            case "Вася": System.out.println("Привет!\nЯ тебя так долго ждал");
            break;
            case "Анастасия": System.out.println("Я тебя так долго ждал");
            break;
            default: System.out.println("Добрый день, а Вы кто?");
            break;
        }
    }
}
