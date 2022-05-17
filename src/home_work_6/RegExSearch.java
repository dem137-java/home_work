package home_work_6;

import home_work_6.api.ISearchEngine;

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
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(text);
        while (m.find()) {
            char charBefore = 0;
            char charAfter = 0;
            if (m.start()==0) {
                charBefore = '!';
            } else {
                charBefore = text.charAt(m.start()-1);
            }
            if (m.end()>text.length()-1){
                charAfter = '!';
            } else {
                charAfter = text.charAt(m.end());
            }
            if (!Character.isLetterOrDigit(charBefore)&&charBefore!='-'&&!Character.isLetterOrDigit(charAfter)&&charAfter!='-') {
                count++;
            }
        }
        return count;
    }
}
