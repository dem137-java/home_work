package home_work_6.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * класс предназначен для чтения txt файлов
 */
public class FileTxtReader {
    private String filePath;
    private String text;

    public FileTxtReader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String readFileToText(String filePath){
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
