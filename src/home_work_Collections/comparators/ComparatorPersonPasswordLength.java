package home_work_Collections.comparators;

import home_work_Collections.dto.Person;
import java.util.Comparator;

public class  ComparatorPersonPasswordLength implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1==null){
            return o2==null?0:-1;
        }else if(o2==null){
            return 1;
        }else {
            return o1.getPassword().length()-o2.getPassword().length();
        }
    }
}
