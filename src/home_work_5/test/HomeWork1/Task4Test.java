package home_work_5.test.HomeWork1;

import home_work_5.source.HomeWork1.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void isWeekdayCorrect() {
        Assertions.assertTrue(Task4.isWeekday("пн"));
        Assertions.assertFalse(Task4.isWeekday("сб"));
    }

    @Test
    public void isWeekdayIncorrect() {
        Task4.isWeekday("понедельник");
    }

    @Test
    public void isVocationCorrect() {
        Assertions.assertTrue(Task4.isVocation("да"));
        Assertions.assertFalse(Task4.isVocation("нет"));
    }

    @Test
    public void isVocationIncorrect() {
        Task4.isVocation("yes");
    }

    @Test
    public void sleepIn() {
        Assertions.assertFalse(Task4.sleepIn(true,false));
        Assertions.assertTrue(Task4.sleepIn(false,true));
        Assertions.assertTrue(Task4.sleepIn(true,true));
        Assertions.assertTrue(Task4.sleepIn(false,false));
    }

    @Test
    public void canSleepOrNot() {
        Assertions.assertEquals("можно еще поспать...", Task4.canSleepOrNot("пн","да"));
        Assertions.assertEquals("можно еще поспать...", Task4.canSleepOrNot("вс","нет"));
        Assertions.assertEquals("к сожалению пора вставать на работу", Task4.canSleepOrNot("ср","нет"));
        Assertions.assertEquals("к сожалению пора вставать на работу", Task4.canSleepOrNot("пт","нет"));
    }
}
