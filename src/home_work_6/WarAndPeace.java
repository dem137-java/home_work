package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public Set<String> textToSetBySpace (String text){
        text = textEdit(text);
        Set<String> strSet = new TreeSet<>();
        String [] strArr = text.split(" ");
        Collections.addAll(strSet, strArr);
        return strSet;
    }

    /**
     * метод заменяет в переданной строке текста все знаки препинания (!"#$%&'()*+,./:;<=>?@[\]^_`{|}~)
     * кроме одинарного дефиса (-), а также множественный пробел и множественный дефис (2 и более раз)
     * @param text строка текста
     * @return обработанная строка текста
     */
    public String textEdit (String text){
        return text.replaceAll("[\\p{Punct}&&[^-]]+|\\s{2,}|-{2,}"," ");
    }

    public Set<String> textToSet (String text){
        Set<String> uniqueWords = new TreeSet<>();
        Pattern p = Pattern.compile("[а-яА-Я]+|\\w+|[0-9]|[а-яА-Я]+[-][а-яА-Я]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            uniqueWords.add(m.group());
        }
        return uniqueWords;
    }

//    public Set<String> uniqueWords (String text){
//        Set <String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
//        words.addAll()
//
//    } return
}

