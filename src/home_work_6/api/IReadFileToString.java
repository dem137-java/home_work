package home_work_6.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface IReadFileToString {
    default String readFileStrings(String filePath) {
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
