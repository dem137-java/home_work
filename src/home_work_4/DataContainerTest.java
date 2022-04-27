package home_work_4;

public class DataContainerTest {
    public static void main(String[] args) {
        DataContainer container = new DataContainer<Integer>(new Integer[]{999, 30});
        System.out.println(container.toString());
        container.add(5);
        container.add(10);
        System.out.println(container.toString());
        container.sort(new IntegerComparator());
        System.out.println(container.toString());
        container.delete(new Integer(30));
        System.out.println(container.toString());
        container.delete(0);
        System.out.println(container.toString());

        DataContainer container2 = new DataContainer<Integer>(new Integer[]{7, 5, 3, 9, 1});
        System.out.println(container2);
        DataContainer.sort(container2);
        System.out.println(container2);

        DataContainer container3 = new DataContainer<String>(new String[]{"Дмитрий","Виктор","Александр" ,"Java"});
        System.out.println(container3);
        container3.add("Алексей");
        System.out.println(container3);
        container3.sort(new StringComparator());
        System.out.println(container3);

        DataContainer container4 = new DataContainer<String>(new String[]{"Python","Java","Ruby","C"});
        System.out.println(container4);
        DataContainer.sort(container4);
        System.out.println(container4);
        container4.delete(0);
        System.out.println(container4);
        container4.delete("Ruby");
        System.out.println(container4);








    }
}
