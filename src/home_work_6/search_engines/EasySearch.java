package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * класс позволяет находить совпадения строки в тексте и определить количество таких совпаданий
 */
public class EasySearch implements ISearchEngine {

    public long searchAtFile (String filePath, String word){
        String text = readFileStrings(filePath);
        return search(text,word);
    }

    /**
     * метод осуществляет поиск заданной строки в переданном тексте и возвращает количество совпадений
     * @param text тест в котором необходимо провести поиск
     * @param word строка, совпадения с которой нужно посчитать
     * @return количество совпадений
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int startIndex = text.indexOf(word);
        while (startIndex != -1) {
            char charBefore = 0;
            char charAfter = 0;
            if (startIndex==0) {
                charBefore = '!';
            } else {
                charBefore = text.charAt(startIndex-1);
            }
            if (startIndex + word.length()>=text.length()) {
                charAfter = '!';
            } else {
                charAfter = text.charAt(startIndex + word.length());
            }
            if (!Character.isLetterOrDigit(charBefore)&&charBefore!='-'&&!Character.isLetterOrDigit(charAfter)&&charAfter!='-') {
                count++;
            }
            startIndex = text.indexOf(word, startIndex + 1);
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
            System.out.println("Извините, возникла ошибка...");
            e.printStackTrace();
        }
        return text;
    }
}
