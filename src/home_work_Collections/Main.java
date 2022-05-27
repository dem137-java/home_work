package home_work_Collections;

import home_work_Collections.comparators.*;
import home_work_Collections.dto.Animal;
import home_work_Collections.dto.Person;
import home_work_Collections.suplier.AnimalSupplier;
import home_work_Collections.utils.Utils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //заполняем объектами Person, сортируем, итерируем и удаляем элементы в коллекции LinkedList
        List<Person> personLinkedList = new LinkedList<>();
        long start1 = System.currentTimeMillis();
        Utils.fillPersonCollection(personLinkedList, 1_000_000); // заполняем коллекцию типизированным методом
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;
        long start2 = System.currentTimeMillis();
        Utils.sortList(personLinkedList, new ComparatorPersonPasswordLength()); // сортируем коллекцию "своим" методом
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;
        long start3 = System.currentTimeMillis();
        Utils.iterateCollection(personLinkedList); // итерируем коллекцию
        long end3 = System.currentTimeMillis();
        long time3 = end3 - start3;
        long start4 = System.currentTimeMillis();
        Utils.clearCollection(personLinkedList); // удаляем все элементы
        long end4 = System.currentTimeMillis();
        long time4 = end4 - start4;

        //заполняем объектами Person, сортируем, итерируем и удаляем элементы в коллекции ArrayList
        List<Person> personArrayList = new ArrayList<>();
        long start5 = System.currentTimeMillis();
        Utils.fillPersonCollection(personArrayList, 1_000_000); // заполняем коллекцию типизированным методом
        long end5 = System.currentTimeMillis();
        long time5 = end5 - start5;
        long start6 = System.currentTimeMillis();
        personArrayList.sort(new ComparatorPersonPasswordLength().thenComparing(new ComparatorPersonNick())); // сортируем коллекцию средствами JDK
        long end6 = System.currentTimeMillis();
        long time6 = end6 - start6;
        long start7 = System.currentTimeMillis();
        Utils.iterateCollection(personArrayList); // итерируем коллекцию
        long end7 = System.currentTimeMillis();
        long time7 = end7 - start7;
        long start8 = System.currentTimeMillis();
        Utils.clearCollection(personArrayList);  // удаляем все элементы
        long end8 = System.currentTimeMillis();
        long time8 = end8 - start8;

        //заполняем объектами Person, сортируем, итерируем и удаляем элементы в коллекции HashSet
        Set<Person> personHashSet = new HashSet<>();
        long start9 = System.currentTimeMillis();
        Utils.fillPersonCollection(personHashSet, 1_000_000); // заполняем коллекцию типизированным методом
        long end9 = System.currentTimeMillis();
        long time9 = end9 - start9;
        //Utils.sortHashSet(personHashSet,new ComparatorPersonPasswordLength()); // данную коллекцию отсортировать нельзя
        long start10 = System.currentTimeMillis();
        Utils.iterateCollection(personHashSet);  // итерируем коллекцию
        long end10 = System.currentTimeMillis();
        long time10 = end10 - start10;
        long start11 = System.currentTimeMillis();
        Utils.clearCollection(personHashSet);   // удаляем все элементы
        long end11 = System.currentTimeMillis();
        long time11 = end11 - start11;

        //заполняем объектами Person, сортируем, итерируем и удаляем элементы в коллекции TreeSet
        NavigableSet<Person> personTreeSet = new TreeSet<>(new ComparatorPersonHashCode());
        long start12 = System.currentTimeMillis();
        Utils.fillPersonCollection(personTreeSet, 1_000_000); // заполняем коллекцию типизированным методом
        long end12 = System.currentTimeMillis();
        long time12 = end12 - start12;
        long start13 = System.currentTimeMillis();
        personTreeSet = Utils.sortTreeSet(personTreeSet, new ComparatorPersonPasswordLength().thenComparing(new ComparatorPersonNick()
                .thenComparing(new ComparatorPersonHashCode()))); // сортируем коллекцию по длине пароля и ник-нейму
        long end13 = System.currentTimeMillis();
        long time13 = end13 - start13;
        long start14 = System.currentTimeMillis();
        Utils.iterateCollection(personTreeSet);   // итерируем коллекцию
        long end14 = System.currentTimeMillis();
        long time14 = end14 - start14;
        long start15 = System.currentTimeMillis();
        Utils.clearCollection(personTreeSet);    // удаляем все элементы
        long end15 = System.currentTimeMillis();
        long time15 = end15 - start15;



        //заполняем объектами Animal, сортируем, итерируем и удаляем элементы в коллекции LinkedList
        List<Animal> animalLinkedList = new LinkedList<>();
        long start16 = System.currentTimeMillis();
        Utils.fillCollection(animalLinkedList, 1_000_000, new AnimalSupplier()); // заполняем коллекцию дженерик методом
        long end16 = System.currentTimeMillis();
        long time16 = end16 - start16;
        long start17 = System.currentTimeMillis();
        Utils.sortList(animalLinkedList, new ComparatorAnimalAge()); // сортируем коллекцию по возрасту животных
        long end17 = System.currentTimeMillis();
        long time17 = end17 - start17;
        long start18 = System.currentTimeMillis();
        Utils.iterateCollection(animalLinkedList);  // итерируем коллекцию
        long end18 = System.currentTimeMillis();
        long time18 = end18 - start18;
        long start19 = System.currentTimeMillis();
        Utils.clearCollection(animalLinkedList);   // удаляем все элементы
        long end19 = System.currentTimeMillis();
        long time19 = end19 - start19;

        //заполняем объектами Animal, сортируем, итерируем и удаляем элементы в коллекции ArrayList
        List<Animal> animalArrayList = new ArrayList<>();
        long start20 = System.currentTimeMillis();
        Utils.fillCollection(animalArrayList, 1_000_000, new AnimalSupplier());  // заполняем коллекцию дженерик методом
        long end20 = System.currentTimeMillis();
        long time20 = end20 - start20;
        long start21 = System.currentTimeMillis();
        Utils.sortList(animalArrayList, new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick()));  // сортируем коллекцию по возрасту животных и кличке
        long end21 = System.currentTimeMillis();
        long time21 = end21 - start21;
        long start22 = System.currentTimeMillis();
        Utils.iterateCollection(animalArrayList);   // итерируем коллекцию
        long end22 = System.currentTimeMillis();
        long time22 = end22 - start22;
        long start23 = System.currentTimeMillis();
        Utils.clearCollection(animalArrayList);    // удаляем все элементы
        long end23 = System.currentTimeMillis();
        long time23 = end23 - start23;

        //заполняем объектами Animal, сортируем, итерируем и удаляем элементы в коллекции HashSet
        Set<Animal> animalHashSet = new HashSet<>();
        long start24 = System.currentTimeMillis();
        Utils.fillCollection(animalHashSet, 1_000_000, new AnimalSupplier()); // заполняем коллекцию дженерик методом
        long end24 = System.currentTimeMillis();
        long time24 = end24 - start24;
        // данную коллекцию отсортировать нельзя
        long start25 = System.currentTimeMillis();
        Utils.iterateCollection(animalHashSet);  // итерируем коллекцию
        long end25 = System.currentTimeMillis();
        long time25 = end25 - start25;
        long start26 = System.currentTimeMillis();
        Utils.clearCollection(animalHashSet);    // удаляем все элементы
        long end26 = System.currentTimeMillis();
        long time26 = end26 - start26;


        //заполняем объектами Animal, сортируем, итерируем и удаляем элементы в коллекции HashSet
        NavigableSet<Animal> animalTreeSet = new TreeSet<>(new ComparatorAnimalHashCode());
        long start27 = System.currentTimeMillis();
        Utils.fillCollection(animalTreeSet, 1_000_000, new AnimalSupplier());  // заполняем коллекцию дженерик методом
        long end27 = System.currentTimeMillis();
        long time27 = end27 - start27;
        long start28 = System.currentTimeMillis();
        animalTreeSet = Utils.sortTreeSet(animalTreeSet, new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick()
                .thenComparing(new ComparatorAnimalHashCode())));   // сортируем коллекцию по возрасту животных и кличке
        long end28 = System.currentTimeMillis();
        long time28 = end28 - start28;
        long start29 = System.currentTimeMillis();
        Utils.iterateCollection(animalTreeSet);  // итерируем коллекцию
        long end29 = System.currentTimeMillis();
        long time29 = end29 - start29;
        long start30 = System.currentTimeMillis();
        Utils.clearCollection(animalTreeSet);   // удаляем все элементы
        long end30 = System.currentTimeMillis();
        long time30 = end30 - start30;

        printTimeResults("LinkedList",time1,time2,time3,time4);
        printTimeResults("ArrayList",time5,time6,time7,time8);
        printTimeResults("HashSet",time9,0,time10,time11);
        printTimeResults("TreeSet",time12,time13,time14,time15);
        printTimeResults("LinkedList",time16,time17,time18,time19);
        printTimeResults("ArrayList",time20,time21,time22,time23);
        printTimeResults("HashSet",time24,0,time25,time26);
        printTimeResults("TreeSet",time27,time28,time29,time30);
    }

    private static void printTimeResults(String collection,long t1,long t2, long t3, long t4){
        System.out.println(collection+":");
        System.out.println("Операция наполнения: " + (t1) + " мс");
        System.out.println("Операция сортировки: " + (t2) + " мс");
        System.out.println("Операция итерирования: " + (t3) + " мс");
        System.out.println("Операция удаления всех элементов: " + (t4) + " мс");
        System.out.println("================================");
    }
}
