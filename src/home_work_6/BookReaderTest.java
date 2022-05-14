package home_work_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class BookReaderTest {
    private String fileNameWork = "\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_6\\text.txt";
    private String fileNameHome = "\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_6\\text.txt";

//    @Test
//    public void readFileBufferedReader() throws IOException {
//        WarAndPeace book = new WarAndPeace();
//        System.out.println(book.readFileBufferedReader(fileNameWork));
//        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile.txt");
//        FileWriter writer = new FileWriter(newFile,false);
//        writer.write(book.readFileBufferedReader(fileNameWork));
//    }
//
//    @Test
//    public void readFileScanner() throws IOException {
//        WarAndPeace book = new WarAndPeace();
//        System.out.println(book.readFileScanner(fileNameWork));
//        File newFile = new File("\\JAVA\\Projects\\JD1\\HomeWork\\src\\home_work_5\\NewFile2.txt");
//        FileWriter writer = new FileWriter(newFile,false);
//        writer.write(book.readFileScanner(fileNameWork));
//    }
//    @Test
//    public void readFilesString () throws IOException {
//        WarAndPeace book = new WarAndPeace();
//        System.out.println(book.readFileStrings(fileNameWork));
//    }
//    @Test
//    public void textToSet () throws IOException {
//        WarAndPeace book = new WarAndPeace();
//        Set<String> set = book.textToSetMatcher(book.readFileStrings(fileNameHome));
//        System.out.println(set);
//        System.out.println(set.size());
//    }
    @Test
    public void patternTest(){
        System.out.println(Pattern.matches("([а-яА-Я]+)[-]([а-яА-Я]+)","по-белорусски"));
        System.out.println(Pattern.matches("[.,:;'\"?!<>/{}|*%\\t]+|\\s{2,}|-{2}","  "));
        System.out.println(Pattern.matches("[\\p{Punct}&&[^-]]+|\\s{2,}|-{2,}","--"));
        System.out.println(Pattern.matches("[а-яА-Я]+|\\w+|[0-9]|[а-яА-Я]+-[а-яА-Я]+","-"));

    }
//    @Test
//    public void textEdit(){
//        WarAndPeace book = new WarAndPeace();
//        try {
//            System.out.println(book.textEdit(book.readFileStrings(fileNameHome)));
//        }catch (Exception e){
//            System.out.println("плохо все");
//        }
//    }
//    @Test
//    public void textToSetBySpace (){
//        WarAndPeace book = new WarAndPeace();
//        try {
//            Set <String> set = book.textToSetBySpace(book.readFileStrings(fileNameHome));
//            System.out.println(set);
//            System.out.println(set.size());
//        }catch (Exception e){
//            System.out.println("плохо все");
//        }
//        System.out.println();
//    }
    @Test
    public void printSetAndSize(){
        BookReader book = new BookReader();
    }

    @Test
    public void printMap(){
        BookReader book = new BookReader();
        System.out.println(book.topWords(fileNameWork,50000));
    }
    @Test
    public void searchTest (){
        EasySearch search = new EasySearch();
        Assertions.assertEquals(0,search.searchAtFile(fileNameWork, " как "));
    }


}
