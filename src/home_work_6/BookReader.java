package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс позволяет прочитать текстовый файл, преобразовать его в коллекции
 */
public class BookReader {

    /**
     * метод возвращает отсортированный список слов заданной длины (int) с количеством их употреблений в текстовом файле
     * @param filePath путь к файлу
     * @param n количество позиций для вывода
     * @return список слов, отсортированный по их количеству в текстовом файле
     */
    public List <Map.Entry<String, Integer>> topWords (String filePath, int n){
        Map <String, Integer> map = fileToMap(filePath);
        List <Map.Entry<String, Integer>> mapList = new ArrayList(map.entrySet());
        mapList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        if (n<=mapList.size()) {
            return mapList.subList(0, n);
        } else {
            return mapList.subList(0,mapList.size());
        }
    }

    /**
     * метод считывает текстовый файл, разбивает его на уникальные строковые элементы (слова) и возвращает множество (Set)
     * уникальных строковых элементов (слов)
     * @param filePath путь к файлу
     * @return множество (Set) уникальных строковых элементов (слов)
     */
    public Set <String> fileToSet (String filePath){
        Set <String> strSet = stringsToSet(readEditBreakToWords(filePath));
        return strSet;
    }

    /**
     * метод считывает текстовый файл, разбивает его на уникальные строковые элементы (слова) и возвращает Map в котором в качестве
     * ключа используется строка, а в качестве значения - количество данной строки в переданном массиве
     * @param filePath путь к файлу
     * @return Map с ключом-строкой, значением - количество данной строки в переданном массиве
     */
    private Map <String, Integer> fileToMap (String filePath){
        Map <String, Integer> strMap=stringsToMap(readEditBreakToWords(filePath));
        return strMap;
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

    /**
     * метод делегирует чтение, редактирование и разбивку текста на слова другим методам, возвращает массив строк (слов)
     * @param filePath путь к файлу
     * @return массив строк (слов)
     */
    private String [] readEditBreakToWords (String filePath) {
        String text = readFileStrings(filePath);
        text = textEdit(text);
        return textToWordsBySpace(text);
    }

    /**
     * метод считывает файл и возвращает его в виде строки (BufferedReader)
     * @param filePath - путь к файлу
     * @return весь текст в виде строки
     */
    private String readFileBufferedReader(String filePath) {
        StringBuilder builder = new StringBuilder();
        String str = null;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            do {
                str = in.readLine();
                if (str != null) {
                    builder.append(str).append("\n");
                }
            } while (str != null);
        } catch (IOException e) {
            System.out.println("Извините, возникла ошибка ввода/вывода...");
            e.printStackTrace();
        }
        return builder.toString();
    }

    /**
     * метод считывает файл и возвращает его в виде строки (Scanner)
     * @param filePath путь к файлу
     * @return текст в виде строки
     */
    private String readFileScanner(String filePath) {
        File file = new File(filePath);
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Извините, файл не найден");
            e.printStackTrace();
        }
        return builder.toString();
    }

    /**
     * метод считывает файл и возвращает его в виде строки (Files.readString)
     * @param filePath путь к файлу
     * @return теств в виде строки
     */
    private String readFileStrings(String filePath) {
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
     * метод заменяет в переданной строке текста все знаки препинания (!"#$%&'()*+,./:;<=>?@[\]^_`{|}~
     * кроме одинарного дефиса (-)), а также множественный пробел и множественный дефис (2 и более раз) на одинарный пробел
     * @param text строка текста
     * @return обработанная строка текста
     */
    private String textEdit (String text){
        return text.replaceAll("[\\p{Punct}&&[^-]]+|\\s{2,}|-{2,}|\n|\t"," ");
    }

}

