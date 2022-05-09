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

    /**
     * метод для получения числа прописью
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
     * @return строка содержащая число прописью с указанием разряда
     */
    private String threeFigToString(int i, int index) {
        String subResult = "";
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
            subResult += hundredsArray[hundred];
            if (hundred!=0&&(ten!=0||unit!=0)){
                subResult+=" ";
            }
            //формируем и добавляем десятки и единицы
            if (ten == 1 && unit == 0) {
                subResult += dozensArray[ten];
            }
            if (ten == 1 && unit != 0) {
                subResult += elevensArray[unit];
            }
            if (ten != 1) {
                subResult += dozensArray[ten];
                if (ten!=0&&unit!=0){
                    subResult+=" ";
                }
                if (index == 1) {
                    subResult += figures[1][unit];
                } else {
                    subResult += figures[0][unit];
                }
            }
            //добавляем слова разрядов - миллионы и тысячи
            if (million!=0&&index == 0) {
                if (unit == 1) {
                    subResult += " " + wordsMillionArray[0];
                } else if (unit == 2 | unit == 3 | unit == 4) {
                    subResult += " " + wordsMillionArray[1];
                } else {
                    subResult += " " + wordsMillionArray[2];
                }
                if (thousand!=0){
                    subResult+= " ";
                }
            }
            if (thousand!=0&&index == 1) {
                if (unit == 1) {
                    subResult += " " + wordsThousandArray[0];
                } else if (unit == 2 | unit == 3 | unit == 4) {
                    subResult += " " + wordsThousandArray[1];
                } else {
                    subResult += " " + wordsThousandArray[2];
                }
                if (underThousand!=0){
                    subResult+= " ";
                }
            }
            return subResult;
        }
    }
}

