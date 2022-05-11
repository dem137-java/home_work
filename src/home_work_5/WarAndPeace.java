package home_work_5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WarAndPeace {

    public String readFileBufferedReader(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        StringBuilder builder = new StringBuilder();
        String str = null;
        do {
            str = in.readLine();
            if(str != null){
                builder.append(str).append("\n");
            }
        } while (str != null);
        in.close();
        return builder.toString();
    }

    public String readFileScanner(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }
        return builder.toString();
    }

    public String readFileStrings(String fileName) throws IOException {
        Path filePath = Path.of(fileName);
        return Files.readString(filePath);
    }
}

