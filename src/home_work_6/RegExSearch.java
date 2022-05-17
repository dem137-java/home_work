package home_work_6;

import home_work_6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс позволяет осуществлять поиск заданного слова в тексте либо в текстовом файле
 */
public class RegExSearch implements ISearchEngine {

    /**
     * метод осуществляет поиск заданной строки в переданном тексте и возвращает количество совпадений
     * @param text тест в котором необходимо провести поиск
     * @param word строка, совпадения с которой нужно посчитать
     * @return количество совпадений
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
       // text = textEdit(text);
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(text);
        while (m.find()) {
            count++;
        }
        return count;
    }

    /**
     * метод считывает файл и возвращает его в виде строки (Files.readString)
     * @param filePath путь к файлу
     * @return теств в виде строки
     */
    private String readFileStrings(String filePath) {
        Path path = Path.of(filePath);
        String text = "";
        try {
            text = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Извините, возникла ошибка ввода/вывода...");
            e.printStackTrace();
        }
        return text;
    }

//    /**
//     * метод заменяет в переданной строке текста все знаки препинания (!"#$%&'()*+,./:;<=>?@[\]^_`{|}~
//     * кроме одинарного дефиса (-)), а также множественный пробел и множественный дефис (2 и более раз) на одинарный пробел
//     * @param text строка текста
//     * @return обработанная строка текста
//     */
//    private String textEdit (String text){
//        text = text.replaceAll("[\\p{Punct}&&[^-]]+|-{2,}|\n|\t"," ");
//        return text.replaceAll("\\s{2,}", " ");
//    }


}
