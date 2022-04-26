package home_work_4.taskStudent;

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
        printTop10(studentsSorted);
        System.out.println("");

        //сортируем студентов по имени
        studentsSorted.sort(new NameComparator());
        printTop10(studentsSorted);

        //сортируем студентов по возрасту и оценкам



    }

    /**
     * метод рассчитывает средний возраст студентов в переданном массиве объектов типа Student
     * @param studentList массив объектов Student
     * @return средний возраст (тип float)
     */
    public static float getAverageAge(List<Student> studentList){
        float age= 0;
        for (Student s : studentList) {
            age+=s.getAge();
        }
        float result=(float) (age/studentList.size());
        return result;
    }

    /**
     * метод выводит на печать первых 10 элементов массива объектов типа Student
     * @param studentList
     */
    public static void printTop10(List<Student> studentList){
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
    }


//    public String nameRndCorrect(){
//        String[] names = {"Сергей","Андрей","Валерий", "Василий", "Инокентий", "Радомир", "Вячеслав", "Екатерина", "Валентина", "Светлана", "Юлия", "Авдотья", "Дарья", "Тамара"};
//
//    }

}
