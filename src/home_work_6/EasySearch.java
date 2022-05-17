package home_work_6;

import home_work_6.api.ISearchEngine;

/**
 * класс позволяет находить совпадения строки в тексте и определить количество таких совпаданий
 */
public class EasySearch implements ISearchEngine {

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
}
