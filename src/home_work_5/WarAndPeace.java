package home_work_5;

import java.io.*;
import java.util.Scanner;

public class WarAndPeace {
    String fileName = "\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_5\\text.txt";
    String textFull;

    public String readFileBufferedReader() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        StringBuilder builder = new StringBuilder();
        while (in.readLine() != null) {
            builder.append(in.readLine()).append("\n");
        }
        textFull = builder.toString();
        in.close();
        return textFull;
    }

    public String readFileScanner() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }
        textFull = builder.toString();
        return textFull;
    }

    public WarAndPeace() throws IOException {
    }
}

