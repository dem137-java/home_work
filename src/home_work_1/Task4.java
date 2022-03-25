package home_work_1;

import java.util.Scanner;

public class Task4 {

    static boolean weekday;
    static boolean vocation;
    static boolean isSleepIn;


    public static boolean isWeekday() {
        Scanner console1 = new Scanner(System.in);
        System.out.print("Введите день недели (пн, вт, ср, чт, пт, сб, вс): ");
        String dayName = console1.nextLine();

        switch (dayName){
            case "пн": weekday=true;
                break;
            case "вт": weekday=true;
                break;
            case "ср": weekday=true;
                break;
            case "чт": weekday=true;
                break;
            case "пт": weekday=true;
                break;
            case "сб": weekday=false;
                break;
            case "вс": weekday=false;
                break;
            default:
                System.out.println("День недели введен некорректно");
                System.exit(0);
                break;
        }
        return weekday;
    }

    public static boolean isVocation() {
        Scanner console1 = new Scanner(System.in);
        System.out.print("Вы в отпуске? (да/нет): ");
        String vocationOrNot = console1.nextLine();
        switch (vocationOrNot) {
            case "да":
                vocation = true;
                break;
            case "нет":
                vocation = false;
                break;
            default:
                vocation = false;
                System.out.println("Только уставший от работы человек не может определиться с ответом...");
                break;
        }
        return vocation;
    }

    public static boolean sleepIn(boolean weekday, boolean vocation){
        if (weekday&&!vocation){
            isSleepIn=false;
        } else {isSleepIn=true;}
        return isSleepIn;
    }

    public static void main(String[] args) {
        sleepIn(isWeekday(),isVocation());
        if (isSleepIn) {
            System.out.println("можно еще поспать...");
        } else {
            System.out.println("к сожалению пора вставать на работу");
        }
    }
}
