package home_work_6.library;

import home_work_6.search_engines.EasySearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите адрес директории: ");
        String directoryPath = console.nextLine();
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Извините, директория не существует...");
        } else {
            File result = new File("C:/upload/Java/projects/JD1/home_work/src/home_work_6/library/result.txt");
            try (FileWriter writer = new FileWriter(result, true)) {
                int fileNo;
                do {
                    System.out.println("Выберите файл из списка ниже, введите номер файла либо 0 для выхода: ");
                    String[] listOfFiles = directory.list();
                    for (int i = 0; i < listOfFiles.length; i++) {
                        System.out.println((i + 1) + ". " + listOfFiles[i]);
                    }
                    fileNo = console.nextInt();
                    if (fileNo!=0){
                        String fileName = listOfFiles[fileNo - 1];
                        String filePath = directory.getAbsolutePath() + "\\" + fileName;
                        String word;
                        do {
                            System.out.print("Введите слово для поиска либо 0 для выхода из меню: ");
                            console = new Scanner(System.in);
                            word = console.nextLine();
                            if (!word.equals("0")) {
                                String text = readFileStrings(filePath);
                                EasySearch searchEngine = new EasySearch();
                                long count = searchEngine.search(text, word);
                                String record = fileName + " - " + word + " - " +count;
                                writer.write(record+"\n");
                                System.out.println("слово "+word+" было найдено "+count+" раз");
                            }
                        } while (!word.equals("0"));
                    }
                } while (fileNo!=0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * метод считывает файл и возвращает его в виде строки (Files.readString)
     * @param filePath путь к файлу
     * @return теств в виде строки
     */
    private static String readFileStrings(String filePath) {
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
