package home_work_4.taskStudent;

import home_work_4.taskStudent.comparators.AgeComparator;
import home_work_4.taskStudent.comparators.MarkComparator;
import home_work_4.taskStudent.comparators.NameComparator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        //заполняем коллекцию
        List<Student> studentsCollection = new ArrayList<Student>();
        for (int i = 0; i < 10_000; i++) {
            studentsCollection.add(new Student(i+1));
        }

        //фильтруем список студентов по возрасту и оценкам
        List<Student> studentsSorted = new ArrayList<Student>();
        for (Student s : studentsCollection) {
            if (s.getAge() >= 12 && s.getMark() > 8) {
                studentsSorted.add(s);
            }
        }
        System.out.println(studentsSorted.toString());
        System.out.println(new DecimalFormat("#.##").format(getAverageAge(studentsSorted)));

        //сортируем студентов по оценкам
        studentsSorted.sort(new MarkComparator());
        System.out.println("Список студентов, отсортированный по оценкам (топ 10):");
        printTop10(studentsSorted);

        //сортируем студентов по имени
        studentsSorted.sort(new NameComparator());
        System.out.println("Список студентов, отсортированный по имени (топ 10):");
        printTop10(studentsSorted);

        //сортируем студентов по возрасту и оценкам
        studentsSorted.sort(new AgeComparator().thenComparing(new MarkComparator()));
        System.out.println("Список студентов, отсортированный по возрасту и оценкам (топ 10):");
        printTop10(studentsSorted); // печатаем топ 10 всего списка
        System.out.println("Топ 10 студентов по оценкам каждого возраста:");
        printTop10EachAge(studentsSorted); // печатаем топ 10 каждого возраста

    }

    /**
     * метод рассчитывает средний возраст студентов в переданном коллекции объектов типа Student
     * @param studentList массив объектов Student
     * @return средний возраст (тип float)
     */
    public static float getAverageAge(List<Student> studentList){
        float age= 0;
        for (Student s : studentList) {
            age+=s.getAge();
        }
        return age/studentList.size();
    }

    /**
     * метод выводит на печать первых 10 элементов коллекция объектов типа Student
     * @param studentList коллекция объектов типа Student
     */
    public static void printTop10(List<Student> studentList){
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("");
    }

    /**
     * метод печатает топ 10 студентов по оценкам каждого возраста из коллекции объектов типа Student
     * @param studentList коллекция объектов типа Student
     */
    public static void printTop10EachAge(List<Student> studentList) {
        byte currentAge=0;
        int count = 0;

        for (Student student : studentList) {
            if (currentAge != student.getAge()) {
                currentAge = student.getAge();
                count = 0;
            }
            if (count < 10) {
                System.out.println(student);
                count++;
            }
        }
        System.out.println("");
    }
}





