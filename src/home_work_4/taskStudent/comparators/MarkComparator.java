package home_work_4.taskStudent.comparators;

import home_work_4.taskStudent.Student;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark()==o2.getMark()){
            return 0;
        } else if (o1.getMark()>o2.getMark()){
            return -1;
        } else {
            return 1;
        }
    }
}
