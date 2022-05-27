package home_work_Collections.utils;

import home_work_Collections.dto.Animal;
import home_work_Collections.dto.Person;
import home_work_Collections.suplier.AnimalSupplier;
import home_work_Collections.suplier.PersonSupplier;

import java.util.*;
import java.util.function.Supplier;

public class Utils {

    public static <T> void fillCollection (Collection <T> collection, int size, Supplier<T> supplier){
        for (int i = 0; i < size; i++) {
            collection.add(supplier.get());
        }
    }

    public static void fillPersonCollection (Collection <Person> collection, int size){
        Supplier<Person> supplier = new PersonSupplier();
        fillCollection(collection,size,supplier);
    }

    public static void fillAnimalCollection (Collection <Animal> collection, int size){
        Supplier<Animal> supplier = new AnimalSupplier();
        fillCollection(collection,size,supplier);
    }

    public static <T> void fillList (List<T> list, int size, Supplier<T> supplier){
        for (int i = 0; i < size; i++) {
            list.add(supplier.get());
        }
    }

    public static <T> void fillSet (Set<T> set, int size, Supplier<T> supplier){
        for (int i = 0; i < size; i++) {
            set.add(supplier.get());
        }
    }

    public static <T> void sortList (List<T> list, Comparator<T> comparator){
        list.sort(comparator);
    }

//    //попытался, теперь точно знаю, что никак
//    public static <T> void sortHashSet (Set<T> set, Comparator<T> comparator){
//        List<T> personList = new ArrayList<>(set);
//        sortList(personList, comparator);
//        set.clear();
//        set.addAll(personList);
//    }

    public static <T> NavigableSet <T> sortTreeSet (NavigableSet<T> set, Comparator<T> comparator){ // Navigable для того чтобы не передали Set
        NavigableSet<T> tmpSet = new TreeSet<>(comparator);
        tmpSet.addAll(set);
        return tmpSet;
    }

    public static <T> void iterateCollection (Collection<T> collection){
        Iterator<T> it = collection.iterator();
        while (it.hasNext()){
            it.next();
        }
    }

    public static <T> void clearCollection(Collection<T> collection){
        collection.clear();
    }
}
