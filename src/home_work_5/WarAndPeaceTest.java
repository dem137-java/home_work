package home_work_5;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WarAndPeaceTest {
    private String fileName = "\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\text.txt";

    @Test
    public void readFileBufferedReader() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileBufferedReader(fileName));
        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileBufferedReader(fileName));
    }

    @Test
    public void readFileScanner() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileScanner(fileName));
        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile2.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileScanner(fileName));
    }
    @Test
    public void readFilesString () throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileStrings(fileName));
    }
}
