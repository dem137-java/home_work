package home_work_6;

public class BookReaderMain {
    public static void main(String[] args) {
        String filePath = "\\upload\\Java\\projects\\JD1\\home_work\\src\\home_work_6\\text.txt";

        //Task 2.1
        BookReader book = new BookReader();
        System.out.println("Список уникальных слов: " + book.fileToSet(filePath));
        System.out.println("Количество уникальных слов: " + book.fileToSet(filePath).size());

        //Task 2.2
        System.out.println("Список уникальных слов: " + book.fileToMap(filePath));



    }
}
