package home_work_6;

import home_work_6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        String filePath = "/upload/Java/projects/JD1/home_work/src/home_work_6/text.txt";
        String text = readFileStrings(filePath);

        //Task 2.1
        BookReader book = new BookReader();
        System.out.println("Количество уникальных слов: " + book.fileToSet(filePath).size());

        //Task 2.2
        int topN = 10;
        System.out.println("Топ " + topN + " самых употребляемых слов: " + book.topWords(filePath, topN));

        //Task 5
//        EasySearch easySearch = new EasySearch();
//        System.out.println("EasySearch");
//        System.out.println("война: " +easySearch.searchAtFile(filePath, "война") + " раз");
//        System.out.println("и: " + easySearch.searchAtFile(filePath, " и ") + " раз");
//        System.out.println("мир: " +easySearch.searchAtFile(filePath,"мир") + " раз");
//        System.out.println("----------------");
//
//        RegExSearch regExSearch = new RegExSearch();
//        System.out.println("RegExSearch");
//        System.out.println("война: " +regExSearch.searchAtFile(filePath, "война") + " раз");
//        System.out.println("и: " + regExSearch.searchAtFile(filePath, " и ") + " раз");
//        System.out.println("мир: " +regExSearch.searchAtFile(filePath,"мир") + " раз");
//        System.out.println("----------------");
//
//        ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new RegExSearch());
//        System.out.println("SearchEngineCaseNormalizer - RegExSearch");
//        System.out.println("война: " +searchEngine.searchAtFile(filePath, "ВОЙНА") + " раз");
//        System.out.println("и: " + searchEngine.searchAtFile(filePath, " И ") + " раз");
//        System.out.println("мир: " +searchEngine.searchAtFile(filePath,"МИР") + " раз");
//        System.out.println("----------------");
//
//        searchEngine = new SearchEngineCaseNormalizer(new EasySearch());
//        System.out.println("SearchEngineCaseNormalizer - EasySearch");
//        System.out.println("война: " +searchEngine.searchAtFile(filePath, "ВОЙНА") + " раз");
//        System.out.println("и: " + searchEngine.searchAtFile(filePath, " И ") + " раз");
//        System.out.println("мир: " +searchEngine.searchAtFile(filePath,"МИР") + " раз");
//        System.out.println("----------------");

        System.out.println("Search()");
        System.out.println("===================");

        EasySearch easySearch = new EasySearch();
        System.out.println("EasySearch");
        System.out.println("война: " +easySearch.search(text, "война") + " раз");
        System.out.println("и: " + easySearch.search(text, " и ") + " раз");
        System.out.println("мир: " +easySearch.search(text,"мир") + " раз");
        System.out.println("----------------");

        RegExSearch regExSearch = new RegExSearch();
        System.out.println("RegExSearch");
        System.out.println("война: " +regExSearch.search(text, "война") + " раз");
        System.out.println("и: " + regExSearch.search(text, " и ") + " раз");
        System.out.println("мир: " +regExSearch.search(text,"мир") + " раз");
        System.out.println("----------------");

        ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new RegExSearch());
        System.out.println("SearchEngineCaseNormalizer - RegExSearch");
        System.out.println("война: " +searchEngine.search(text, "ВОЙНА") + " раз");
        System.out.println("и: " + searchEngine.search(text, " И ") + " раз");
        System.out.println("мир: " +searchEngine.search(text,"МИР") + " раз");
        System.out.println("----------------");

        searchEngine = new SearchEngineCaseNormalizer(new EasySearch());
        System.out.println("SearchEngineCaseNormalizer - EasySearch");
        System.out.println("война: " +searchEngine.search(text, "ВОЙНА") + " раз");
        System.out.println("и: " + searchEngine.search(text, " И ") + " раз");
        System.out.println("мир: " +searchEngine.search(text,"МИР") + " раз");
        System.out.println("----------------");

    }

    private static String readFileStrings(String filePath) {
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
}
