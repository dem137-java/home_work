package home_work_5;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WarAndPeaceTest {
    @Test
    public void readFileBufferedReader() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileBufferedReader());
        File newFile = new File("\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_5\\NewFile.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileBufferedReader());
    }

    @Test
    public void readFileScanner() throws IOException {
        WarAndPeace book = new WarAndPeace();
        System.out.println(book.readFileScanner());
        File newFile = new File("\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_5\\NewFile2.txt");
        FileWriter writer = new FileWriter(newFile,false);
        writer.write(book.readFileScanner());
    }
}
