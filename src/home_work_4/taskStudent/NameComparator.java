package home_work_4.taskStudent;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = 0;
        int minLength = Math.min(o1.getName().length(), o2.getName().length());
        char[] name1 = o1.getName().toCharArray();
        char[] name2 = o2.getName().toCharArray();
        for (int i = 0; i < minLength; i++) {
            if ((int) name1[i]!=(int) name2[i]) {
                result = (int) name1[i] - (int) name2[i];
                break;
            }
        }
        return result;
    }
}