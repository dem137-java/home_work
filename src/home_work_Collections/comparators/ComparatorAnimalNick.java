package home_work_Collections.comparators;

import home_work_Collections.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalNick implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1==null){
            return o2==null?0:-1;
        }else if(o2==null){
            return 1;
        }else {
            int result = 0;
            int minLength = Math.min(o1.getNick().length(), o2.getNick().length());
            char[] name1 = o1.getNick().toCharArray();
            char[] name2 = o2.getNick().toCharArray();
            for (int i = 0; i < minLength; i++) {
                if ((int) name1[i]!=(int) name2[i]) {
                    result = (int) name1[i] - (int) name2[i];
                    break;
                }
            }
            return result;
        }
    }
}
