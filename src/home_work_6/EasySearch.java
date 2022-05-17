package home_work_6;

import home_work_6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * класс позволяет находить совпадения строки в тексте или текстовом файле и определить количество таких совпаданий
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
        //text = textEdit(text);
        int startIndex = text.indexOf(word);
        while (startIndex >= 0) {
            count++;
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

//    private String textEdit (String text){
//        String [] punctuation = {"!","#","$","%","&","'",")","(","*","+",",",".","/",":",";","<","=",">","?","@","<",
//                "[","\\","]","^","_","`","{","|","}","~", "\n", "\t", "  ","   ","--","---"};
//        for (String s : punctuation) {
//            text = text.replace(s, " ");
//        }
//        return text;
//    }

}
