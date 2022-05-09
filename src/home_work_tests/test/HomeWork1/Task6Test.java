package home_work_tests.test.HomeWork1;

import home_work_tests.source.HomeWork1.Task6;
import home_work_tests.source.HomeWork1.Task6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    public void createPhoneNumber() {
        Task6.numbers=new int[]{0,1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals("(012) 345-6789", Task6.createPhoneNumber(Task6.numbers));
        Task6_2.numbers=new int[]{0,1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals("(012) 345-6789", Task6.createPhoneNumber(Task6_2.numbers));
    }
}
