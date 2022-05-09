package home_work_tests.test.HomeWork2;

import home_work_tests.source.HomeWork2.Task4_2.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_1Test {
    @Test
    public void arrayRandom(){
        Assertions.assertEquals(new int[4].length, (ArraysUtils.arrayRandom(4,100)).length);

        int[] array = ArraysUtils.arrayRandom(5,100);
        Assertions.assertEquals(5, array.length);
        for (int i = 0; i < array.length; i++) {
            Assertions.assertTrue(array[i]<100);
            Assertions.assertTrue(array[i]>=0);
            System.out.println(array[i]);
        }
    }
}
