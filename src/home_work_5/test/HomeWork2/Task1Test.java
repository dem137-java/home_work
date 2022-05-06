package home_work_5.test.HomeWork2;

import home_work_5.source.HomeWork2.Task1.Task_1_1_1;
import home_work_5.source.HomeWork2.Task1.Task_1_1_2;
import home_work_5.source.HomeWork2.Task1.Task_1_2;
import home_work_5.source.HomeWork2.Task1.Task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void multiplyNumberLessOrEqualZero() {
        Assertions.assertEquals("Введенное число меньше либо равно 0 и не соответствует условиям задания", Task_1_1_1.multiply(-3));
        Assertions.assertEquals("Введенное число меньше либо равно 0 и не соответствует условиям задания", Task_1_1_1.multiply(0));
    }
    @Test
    public void multiplyNumberEqualOne() {
        Assertions.assertEquals("1*1=1", Task_1_1_1.multiply(1));
    }
    @Test
    public void multiplyNumberMoreOne() {
        Assertions.assertEquals("1*2*3=6", Task_1_1_1.multiply(3));
        Assertions.assertEquals("1*2*3*4*5=120", Task_1_1_1.multiply(5));
    }
    @Test
    public void recursion1LessZero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals(6, obj.recursion1(-3));
        Assertions.assertEquals(120, obj.recursion1(-5));
    }
    @Test
    public void recursion1Zero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals(0, obj.recursion1(0));
    }
    @Test
    public void recursion1MoreZero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals(6, obj.recursion1(3));
        Assertions.assertEquals(120, obj.recursion1(5));
    }
    @Test
    public void recursion2LessZero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals("6", obj.recursion2(-3));
        Assertions.assertEquals("120", obj.recursion2(-5));
    }
    @Test
    public void recursion2Zero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals("0", obj.recursion2(0));
    }
    @Test
    public void recursion2MoreZero() {
        Task_1_1_2 obj = new Task_1_1_2();
        Assertions.assertEquals("6", obj.recursion2(3));
        Assertions.assertEquals("120", obj.recursion2(5));
    }
    @Test
    public void Task_1_2() {
        Task_1_2 obj = new Task_1_2();
        Assertions.assertEquals("Введено не целое число", obj.job("321.65"));
        Assertions.assertEquals("Введено не число", obj.job("Hi"));
        Assertions.assertEquals("3 * 2 * 1 = 6", obj.job("321"));
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", obj.job("181232375"));
    }
    @Test
    public void Task_1_3() {
        Task_1_3 obj = new Task_1_3();
        Assertions.assertEquals("Степень не может быть отрицательной", obj.getPowerString(5,-2));
        Assertions.assertEquals("5.0 ^ 2 = 25.0", obj.getPowerString(5,2));
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", obj.getPowerString(18,5));
        Assertions.assertEquals("7.5 ^ 2 = 56.25", obj.getPowerString(7.5,2));
    }

}
