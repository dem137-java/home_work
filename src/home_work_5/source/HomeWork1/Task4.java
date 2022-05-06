package home_work_5.source.HomeWork1;

public class Task4 {

    static boolean weekday;
    static boolean vocation;
    static boolean isSleepIn;

    /**
     * метод для определения рабочего дня
     * @return значение false в случае выходного дня и true в случае рабочего дня
     */
    public static boolean isWeekday(String dayName) {

        if (!dayName.equalsIgnoreCase("пн")&&!dayName.equalsIgnoreCase("вт")&&!dayName.equalsIgnoreCase("ср")&&!dayName.equalsIgnoreCase("чт")&&!dayName.equalsIgnoreCase("пт")&&!dayName.equalsIgnoreCase("сб")&&!dayName.equalsIgnoreCase("вс")){
            System.out.println("День недели введен некорректно (необходимо ввести пн, вт, ср, чт, пт, сб, вс)");
        }
        switch (dayName) {
            case "пн":
                weekday = true;
                break;
            case "вт":
                weekday = true;
                break;
            case "ср":
                weekday = true;
                break;
            case "чт":
                weekday = true;
                break;
            case "пт":
                weekday = true;
                break;
            default:
                weekday = false;
                break;
        }
        return weekday;
    }

    /**
     * метод для определения отпуска
     * @return значение true в случае отпуска и false в случае рабочего дня
     */
    public static boolean isVocation(String vocationOrNot) {
        if (!vocationOrNot.equalsIgnoreCase("да")&&!vocationOrNot.equalsIgnoreCase("нет")) {
            System.out.println("Ответ введен некорректно, введите да/нет");
        }
        if ("да".equalsIgnoreCase(vocationOrNot)) {
            vocation = true;
        } else {
            vocation = false;
        }
        return vocation;
    }

    /**
     * метод для определения можно ли еще поспать или пора вставать
     * @param weekday - boolean является ли день рабочим (true - является, false - не является)
     * @param vocation - boolean находимся ли в отпуске (true - находимся, false - не находимся)
     * @return - boolean можем ли спать еще (true - можем, false - не можем)
     */
    public static boolean sleepIn(boolean weekday, boolean vocation){
        if (weekday&&!vocation){
            isSleepIn=false;
        } else {isSleepIn=true;}
        return isSleepIn;
    }
    public static String canSleepOrNot(String dayName, String vocationOrNot){
        sleepIn(isWeekday(dayName),isVocation(vocationOrNot));
        if (isSleepIn) {
            return "можно еще поспать...";
        } else {
            return "к сожалению пора вставать на работу";
        }
    }
}
