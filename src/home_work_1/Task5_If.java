package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_If {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = console.nextLine();

        if (Objects.equals(inputName,name1)){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if (Objects.equals(inputName,name2)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(inputName,name1) && !Objects.equals(inputName,name2)){
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}
