package home_work_6;

import home_work_6.api.IReadFileToString;
import home_work_6.api.ISearchEngine;

/**
 * класс позволяет находить совпадения строки в тексте или текстовом файле и определить количество таких совпаданий
 */
public class EasySearch implements ISearchEngine, IReadFileToString {

    /**
     * метод считает совпадения заданной строки в переданном тексте (в формате строки)
     * @param filePath путь к текстовому файлу
     * @param word строка, совпадения с которой необходимо найти
     * @return количество совпадений строки
     */
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
        while (startIndex >= 0) {
            count++;
            startIndex = text.indexOf(word, startIndex + 1);
        }
        return count;
    }
}
