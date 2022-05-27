package home_work_Collections.comparators;

import home_work_Collections.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalAge implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1==null){
            return o2==null?0:-1;
        }else if(o2==null){
            return 1;
        }else {
            return o1.getAge()-o2.getAge();
        }
    }
}
