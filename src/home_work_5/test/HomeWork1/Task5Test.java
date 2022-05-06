package home_work_5.test.HomeWork1;

import home_work_5.source.HomeWork1.Task5_ElseIf;
import home_work_5.source.HomeWork1.Task5_If;
import home_work_5.source.HomeWork1.Task5_Switch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    public void ElseIf(){
        Task5_ElseIf obj = new Task5_ElseIf();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",obj.welcom("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал",obj.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а Вы кто?",obj.welcom("Петр"));
    }

    @Test
    public void If(){
        Task5_If obj = new Task5_If();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",obj.welcom("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал",obj.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а Вы кто?",obj.welcom("Петр"));
    }

    @Test
    public void Switch(){
        Task5_Switch obj = new Task5_Switch();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",obj.welcom("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал",obj.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а Вы кто?",obj.welcom("Петр"));
    }


}
