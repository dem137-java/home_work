package home_work_Collections;

import home_work_Collections.comparators.*;
import home_work_Collections.dto.Animal;
import home_work_Collections.dto.Person;
import home_work_Collections.suplier.AnimalSupplier;
import home_work_Collections.utils.Utils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //заполняем и сортируем коллекции объектами Person
        List<Person> personLinkedList = new LinkedList<>();
        Utils.fillPersonCollection(personLinkedList,1_000_000); // заполняем коллекцию типизированным методом
        Utils.sortList(personLinkedList,new ComparatorPersonPasswordLength()); // сортируем коллекцию "своим" методом

        List<Person> personArrayList = new ArrayList<>();
        Utils.fillPersonCollection(personArrayList, 1_000_000); // заполняем коллекцию типизированным методом
        personArrayList.sort(new ComparatorPersonPasswordLength().thenComparing(new ComparatorPersonNick())); // сортируем коллекцию средствами JDK

        Set<Person> personHashSet = new HashSet<>();
        Utils.fillPersonCollection(personHashSet,1_000_000); // заполняем коллекцию типизированным методом
        //Utils.sortHashSet(personHashSet,new ComparatorPersonPasswordLength()); // данную коллекцию отсортировать нельзя

        NavigableSet<Person> personTreeSet = new TreeSet<>(new ComparatorPersonHashCode()); // Navigable для того чтобы не передали Set
        Utils.fillPersonCollection(personTreeSet,1_000_000); // заполняем коллекцию типизированным методом
        personTreeSet = Utils.sortTreeSet(personTreeSet,new ComparatorPersonPasswordLength().thenComparing(new ComparatorPersonNick()
                .thenComparing(new ComparatorPersonHashCode()))); // сортируем коллекцию по длине пароля и ник-нейму

        //заполняем и сортируем коллекции объектами Animal
        List<Animal> animalLinkedList = new LinkedList<>();
        Utils.fillCollection(animalLinkedList,1_000_000,new AnimalSupplier()); // заполняем коллекцию дженерик методом
        Utils.sortList(animalLinkedList, new ComparatorAnimalAge()); // сортируем коллекцию по возрасту животных

        List<Animal> animalArrayList = new ArrayList<>();
        Utils.fillCollection(animalArrayList,1_00,new AnimalSupplier());  // заполняем коллекцию дженерик методом
        Utils.sortList(animalArrayList,new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick()));  // сортируем коллекцию по возрасту животных и кличке

        Set<Animal> animalHashSet = new HashSet<>();
        Utils.fillCollection(animalHashSet,1_000_000,new AnimalSupplier()); // заполняем коллекцию дженерик методом
        // данную колекцию отсортировать нельзя

        NavigableSet<Animal> animalTreeSet = new TreeSet<>(new ComparatorAnimalHashCode());
        Utils.fillCollection(animalTreeSet,1_00,new AnimalSupplier());  // заполняем коллекцию дженерик методом
        animalTreeSet = Utils.sortTreeSet(animalTreeSet,new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick()
                .thenComparing(new ComparatorAnimalHashCode())));   // сортируем коллекцию по возрасту животных и кличке
    }
}
