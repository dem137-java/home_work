package home_work_6;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        String filePath = "/upload/Java/projects/JD1/home_work/src/home_work_6/text.txt";

        //Task 2.1
        BookReader book = new BookReader();
        System.out.println("Количество уникальных слов: " + book.fileToSet(filePath).size());

        //Task 2.2
        int topN = 10;
        System.out.println("Топ " + topN + " самых употребляемых слов: " + book.topWords(filePath, topN));

        //Task 5
        EasySearch srch = new EasySearch();
        System.out.println("EasySearch");
        System.out.println("война: " +srch.search(srch.readFileStrings(filePath),"война") + " раз");
        System.out.println("и: " +srch.search(srch.readFileStrings(filePath)," и ") + " раз");
        System.out.println("мир: " +srch.search(srch.readFileStrings(filePath),"мир") + " раз");
        System.out.println("----------------");

    }
}
