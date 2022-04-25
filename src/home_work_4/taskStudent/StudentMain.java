package home_work_4.taskStudent;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentsCollection = new ArrayList<Student>();
        for (int i = 0; i < 10_000; i++) {
            studentsCollection.add(new Student());
        }

        //фильтруем список студентов по возрасту и оценкам
        List<Student> studentsSorted = new ArrayList<Student>();
        for (Student s : studentsCollection) {
            if (s.getAge() >= 12) ;
            {
                if (s.getMark() > 8) {
                    studentsSorted.add(s);
                }
            }
        }
        System.out.println(new DecimalFormat("#.##").format(getAverageAge(studentsSorted)));
    }

    public static float getAverageAge(List<Student> studentList){
        float age= 0;
        for (Student s : studentList) {
            age+=s.getAge();
        }
        float result=(float) (age/studentList.size());
        return result;
    }

//    public String nameRndCorrect(){
//        String[] names = {"Сергей","Андрей","Валерий", "Василий", "Инокентий", "Радомир", "Вячеслав", "Екатерина", "Валентина", "Светлана", "Юлия", "Авдотья", "Дарья", "Тамара"};
//
//    }

}
