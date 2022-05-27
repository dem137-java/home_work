package home_work_Collections.comparators;

import home_work_Collections.dto.Person;

import java.util.Comparator;

public class ComparatorPersonPassword implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1==null){
            return o2==null?0:-1;
        }else if(o2==null){
            return 1;
        }else {
            int result = 0;
            int minLength = Math.min(o1.getPassword().length(), o2.getPassword().length());
            char[] password1 = o1.getPassword().toCharArray();
            char[] password2 = o2.getPassword().toCharArray();
            for (int i = 0; i < minLength; i++) {
                if ((int) password1[i]!=(int) password2[i]) {
                    result = (int) password1[i] - (int) password2[i];
                    break;
                }
            }
            return result;
        }
    }
}
