package home_work_Strings;

/**
 * класс предназначен для получения прописью числа из диапазона от -999999999 до 999999999
 */
public class NumberToString {
    private int underThousand;
    private int thousand;
    private int million;

    private final String[][] figures = {
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}
    };
    private final String[] elevensArray = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
    private final String[] dozensArray = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private final String[] hundredsArray = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private final String[] wordsMillionArray = {"миллион", "миллиона", "миллионов"};
    private final String[] wordsThousandArray = {"тысяча", "тысячи", "тысяч"};
    private final String[][] wordsTime = {
            {" часов ", " час "," часа "},
            {" минут ", " минута ", " минуты "},
            {" секунд "," секунда "," секунды "},
            {" миллисекунд"," миллисекунда"," миллисекунды"}
    };

    /**
     * метод для получения вещественного числа прописью
     * @param number число для конвертации в строку
     * @return строка содержащая число прописью
     */
    public String toString(double number) {
        String result="";
        String numbers[] = String.valueOf(number).split("\\.");
        numbers[1] = numbers[1].substring(0,2);
        int beforeComma = Integer.parseInt(numbers[0]);
        int afterComma = Integer.parseInt(numbers[1]);
        if (number<0&&beforeComma==0){
            result+="минус ";
        }
        result += toString(beforeComma) + " целых " + threeFigToString(afterComma,3);
        if (afterComma%10==1){
            result+= " сотая";
        } else if (afterComma%10==2||afterComma%10==3||afterComma%10==4){
            result+= " сотые";
        } else {
            result+= " сотых";
        }
        return result;
    }

    /**
         * метод для получения целочисленного числа прописью
         * @param number число для конвертации в строку
         * @return строка содержащая число прописью
         */
    public String toString(int number) {
        String result = "";
        if (number > 999999999 || number < -999999999) {
            return "число вне диапазона от -999999999 до 999999999";
        }
        if (number == 0) {
            return "ноль";
        }
        if (number < 0) {
            result += "минус ";
            number = -number;
        }
        //разбиваем число на разряды (по 3 цифры)
        million = number / 1_000_000;
        thousand = (number - (million * 1_000_000)) / 1000;
        underThousand = (number - (million * 1_000_000)) % 1000;
        return result += threeFigToString(million, 0) + threeFigToString(thousand, 1) + threeFigToString(underThousand, 2);
    }

    /**
     * метод предназначен для получения прописью числа, состоящего из трех цифр
     * @param i сегмент числа из 3-х цифр
     * @param index индекс для определения разряда (0-миллионы,1-тысячи)
     * @return строка содержащая число прописью с указанием разряда (миллионы, тысячи)
     */
    private String threeFigToString(int i, int index) {
        String result = "";
        int hundred;
        int ten;
        int unit;

        if (i == 0) {
            return "";
        } else {
            //делим число на разряды
            hundred = i / 100;
            ten = (i - hundred * 100) / 10;
            unit = (i - hundred * 100) % 10;

            //добавляем сотни
            result += hundredsArray[hundred];
            if (hundred!=0&&(ten!=0||unit!=0)){
                result+=" ";
            }
            //формируем и добавляем десятки и единицы
            if (ten == 1 && unit == 0) {
                result += dozensArray[ten];
            }
            if (ten == 1 && unit != 0) {
                result += elevensArray[unit];
            }
            if (ten != 1) {
                result += dozensArray[ten];
                if (ten!=0&&unit!=0){
                    result+=" ";
                }
                if (index == 1||index==3) {
                    result += figures[1][unit];
                } else {
                    result += figures[0][unit];
                }
            }
            //добавляем слова разрядов - миллионы и тысячи
            if (million!=0&&index == 0) {
                if (unit == 1) {
                    result += " " + wordsMillionArray[0];
                } else if (unit == 2 | unit == 3 | unit == 4) {
                    result += " " + wordsMillionArray[1];
                } else {
                    result += " " + wordsMillionArray[2];
                }
                if (thousand!=0){
                    result+= " ";
                }
            }
            if (thousand!=0&&index == 1) {
                if (unit == 1) {
                    result += " " + wordsThousandArray[0];
                } else if (unit == 2 | unit == 3 | unit == 4) {
                    result += " " + wordsThousandArray[1];
                } else {
                    result += " " + wordsThousandArray[2];
                }
                if (underThousand!=0){
                    result+= " ";
                }
            }
            return result;
        }
    }

    /**
     * метод возвращает количество недель в переданном числе дней в формате строки
     * @param day количество дней
     * @return строка, содержащая количество недель
     */
    public String toWeek(int day) {
        int weeks = day / 7;
        String result = String.valueOf(weeks) + " ";
        switch (weeks) {
            case 1:
                result += "неделя";
                break;
            case 2:
            case 3:
            case 4:
                result += "недели";
                break;
            default:
                result += "недель";
                break;
        }
        return result;
    }

    /**
     * метод преобразует количество миллисекунд в строку, содержащую количество часов, минут, секунд и миллисекунд
     * в опредененном формате
     * "HH:mm:ss.SSS" - при сокращенном формате (где HH - это часы, mm - минуты, ss - секунды, SSS - миллисекунды)
     * "HH часов mm минут ss секунд SSS миллисекунд" - при полном формате
     * @param millisecond количество милиссекунд
     * @param shortFormat true - сокращенный формат, false - полный формат
     * @return строка, содержащая количество часов, минут, секунд и миллисекунд
     */
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        String result="";
        int millis = (int) (millisecond%1000);
        String milliseconds = millisecondsToString(millis);
        int secsTotal = (int) (millisecond/1000);
        int secs = secsTotal%60;
        String seconds = secsMinsHrsToString(secs);
        int minsTotal = secsTotal/60;
        int mins = minsTotal%60;
        String minutes = secsMinsHrsToString(mins);
        int hrsTotal = minsTotal/60;
        String hours = secsMinsHrsToString(hrsTotal);

        if (shortFormat){
            result+=hours + ":" + minutes + ":" + seconds + "." + milliseconds;
        }else{
            if(hrsTotal%10==1&& restDiv100NotEqualsTo11_12_13_14(hrsTotal)){
                result+=hrsTotal + wordsTime[0][1];
            } else if (restDiv10EqualsTo2_3_4(hrsTotal)&& restDiv100NotEqualsTo11_12_13_14(hrsTotal)){
                result+=hrsTotal + wordsTime[0][2];
            }else {
                result+=hrsTotal + wordsTime[0][0];
            }
            if(mins%10==1&& restDiv100NotEqualsTo11_12_13_14(mins)){
                result+=mins + wordsTime[1][1];
            } else if (restDiv10EqualsTo2_3_4(mins)&& restDiv100NotEqualsTo11_12_13_14(mins)){
                result+=mins + wordsTime[1][2];
            }else {
                result+=mins + wordsTime[1][0];
            }
            if(secs%10==1&& restDiv100NotEqualsTo11_12_13_14(secs)){
                result+=secs + wordsTime[2][1];
            } else if (restDiv10EqualsTo2_3_4(secs)&& restDiv100NotEqualsTo11_12_13_14(secs)){
                result+=secs + wordsTime[2][2];
            }else {
                result+=secs + wordsTime[2][0];
            }
            if(millis%10==1&& restDiv100NotEqualsTo11_12_13_14(millis)){
                result+=millis + wordsTime[3][1];
            } else if (restDiv10EqualsTo2_3_4(millis)&& restDiv100NotEqualsTo11_12_13_14(millis)){
                result+=millis + wordsTime[3][2];
            }else {
                result+=millis + wordsTime[3][0];
            }
        }
    return result;
    }

    /**
     * метод возвращает строку, содержащую количество миллисекунд
     * @param milliseconds число миллисекунд (int)
     * @return количество миллисекунд в формате строки
     */
    private String millisecondsToString(int milliseconds){
        String result="";
        if (String.valueOf(milliseconds).length()==1){
            result+="00"+milliseconds;
        } else if (String.valueOf(milliseconds).length()==2){
            result+="0"+milliseconds;
        } else {
            result+=milliseconds;
        }
        return result;
    }
    /**
     * метод возвращает строку, содержащую количество секунд или минут или часов
     * @param i число int секунд или минут или часов
     * @return количество секунд или минут или часов в формате строки
     */
    private String secsMinsHrsToString (int i){
        String result="";
        if (String.valueOf(i).length()==1){
            result+="0"+i;
        }else {
            result+=i;
        }
        return result;
    }

    /**
     * метод возвращает false если остаток от деления числа на 100 равен 11, 12, 13, 14 и true если не равен
     * @param i число
     * @return false если остаток от деления числа на 100 равен 11, 12, 13, 14 и true если не равен
     */
    private boolean restDiv100NotEqualsTo11_12_13_14(int i){
        if (i%100==11||i%100==12||i%100==13||i%100==14){
            return false;
        } else{
            return true;
        }
    }
    /**
     * метод возвращает false если остаток от деления числа на 10 не равен 2, 3, 4 и true если равен
     * @param i число
     * @return false если остаток от деления числа на 10 не равен 2, 3, 4 и true если равен
     */
    private boolean restDiv10EqualsTo2_3_4(int i){
        if (i%10==2||i%10==3||i%10==4){
            return true;
        } else{
            return false;
        }
    }
}

