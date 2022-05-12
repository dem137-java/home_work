package home_work_6;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WarAndPeaceTest {
    private String fileNameWork = "\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_6\\text22.txt";

    @Test
    public void readFileBufferedReader() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileBufferedReader(fileNameWork));
        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileBufferedReader(fileNameWork));
    }

    @Test
    public void readFileScanner() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileScanner(fileNameWork));
        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile2.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileScanner(fileNameWork));
    }
    @Test
    public void readFilesString () throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileStrings(fileNameWork));
    }
    @Test
    public void textToSet () throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.textToSet(book.readFileStrings(fileNameWork)));
    }
}
