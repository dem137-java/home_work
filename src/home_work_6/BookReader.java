package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookReader {

    /**
     * метод считывает файл, разбивает его на уникальные строковые элементы (слова) и возвращает множество (set) уникальных
     * строковых элементов (слов)
     * @param filePath путь к файлу
     * @return множество уникальных строковых элементов (слов)
     */
    public Set <String> fileToSet (String filePath){
        Set <String> strSet = new TreeSet<String>();
        try {
            strSet = stringsToSet(readEditBreakToWords(filePath));
        } catch (IOException e) {
            System.out.println("Что-то пошло не так...");
            e.printStackTrace();
        }
        return strSet;
    }

    /**
     * метод считывает файл, разбивает его на уникальные строковые элементы (слова) и возвращает Map в котором в качестве
     * ключа используется строка, а в качестве значения - количество данной строки в переданном массиве
     * @param filePath путь к файлу
     * @return
     */
    public Map <String, Integer> fileToMap (String filePath){
        Map <String, Integer> strMap= new HashMap<String, Integer>();
        try {
            strMap = stringsToMap(readEditBreakToWords(filePath));
        } catch (IOException e) {
            System.out.println("Что-то пошло не так...");
            e.printStackTrace();
        }
        return strMap;
    }

    /**
     * метод делегирует чтение, редактирование и разбивку текста на слова другим методам, возвращает массив строк (слов)
     * @param filePath путь к файлу
     * @return массив строк (слов)
     * @throws IOException исключение
     */
    private String [] readEditBreakToWords (String filePath) throws IOException {
        String text = readFileStrings(filePath);
        text = textEdit(text);
        return textToWordsBySpace(text);
    }

    /**
     * метод считывает файл и возвращает его в виде строки (BufferedReader)
     * @param filePath - путь к файлу
     * @return весь текст в виде строки
     * @throws IOException исключение
     */
    private String readFileBufferedReader(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));
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

    /**
     * метод считывает файл и возвращает его в виде строки (Scanner)
     * @param filePath путь к файлу
     * @return текст в виде строки
     * @throws FileNotFoundException исключение
     */
    private String readFileScanner(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }
        return builder.toString();
    }

    /**
     * метод считывает файл и возвращает его в виде строки (Files.readString)
     * @param filePath путь к файлу
     * @return теств в виде строки
     * @throws IOException исключение
     */
    private String readFileStrings(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readString(path);
    }

    /**
     * метод формирует из переданного массива строк множество уникальных элементов
     * @param strArr массив строк
     * @return множество уникальных строк
     */
    private Set<String> stringsToSet(String [] strArr){
        Set<String> strSet = new TreeSet<>();
        Collections.addAll(strSet, strArr);
        return strSet;
    }

    /**
     * метод формирует из переданного массива строк Map в котором в качестве ключа используется строка
     * а в качестве значения - количество данной строки в переданном массиве
     * @param strArr - массив строк
     * @return - Map
     */
    private Map<String, Integer> stringsToMap(String [] strArr){
        Map<String, Integer> strMap = new HashMap<>();
        for (String s : strArr) {
            Integer count = strMap.get(s);
            strMap.put(s, count == null ? 1 : count+1);
        }
        return strMap;
    }

    /**
     * метод разбивает переданный текст на элементы (разделитель - пробел) и формирует массив строк
     * @param text текст  в виде строки
     * @return массив строк
     */
    private String[] textToWordsBySpace (String text){
        text = textEdit(text);
        return text.split(" ");
    }

    /**
     * метод заменяет в переданной строке текста все знаки препинания (!"#$%&'()*+,./:;<=>?@[\]^_`{|}~)
     * кроме одинарного дефиса (-), а также множественный пробел и множественный дефис (2 и более раз) на одинарный пробел
     * @param text строка текста
     * @return обработанная строка текста
     */
    private String textEdit (String text){
        return text.replaceAll("[\\p{Punct}&&[^-]]+|\\s{2,}|-{2,}"," ");
    }

    /**
     * метод формирует множество уникальных слов в переданном тексте
     * @param text тект
     * @return множество уникальных слов
     */
    private Set<String> textToSetMatcher (String text){
        Set<String> uniqueWords = new TreeSet<>();
        Pattern p = Pattern.compile("[а-яА-Я]+|\\w+|[0-9]|[а-яА-Я]+-[а-яА-Я]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            uniqueWords.add(m.group());
        }
        return uniqueWords;
    }
}

