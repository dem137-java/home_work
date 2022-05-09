package home_work_Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberToStringTest {
    @Test
    public void ZeroAndOutOfBoundsTest() {
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("ноль", obj.toString(0));
        Assertions.assertEquals("число вне диапазона от -999999999 до 999999999", obj.toString(1777777777));
        Assertions.assertEquals("число вне диапазона от -999999999 до 999999999", obj.toString(-1777777777));
    }
        @Test
    public void hundredsTest(){
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("сто двадцать пять",obj.toString(125));
        Assertions.assertEquals("пять",obj.toString(5));
        Assertions.assertEquals("сорок один",obj.toString(41));
        Assertions.assertEquals("девяносто семь",obj.toString(97));
        Assertions.assertEquals("тринадцать",obj.toString(13));
        Assertions.assertEquals("сто пять",obj.toString(105));
    }

    @Test
    public void thousandsTest(){
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("одна тысяча сто двадцать пять",obj.toString(1125));
        Assertions.assertEquals("две тысячи пять",obj.toString(2005));
        Assertions.assertEquals("сто двадцать две тысячи сорок один",obj.toString(122041));
        Assertions.assertEquals("девятьсот тысяч",obj.toString(900000));
        Assertions.assertEquals("одна тысяча",obj.toString(1000));
        Assertions.assertEquals("сто пять тысяч триста восемьдесят четыре",obj.toString(105384));
    }
    @Test
    public void millionsTest(){
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("один миллион",obj.toString(1000000));
        Assertions.assertEquals("девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять",obj.toString(999999999));
        Assertions.assertEquals("один миллион сто двадцать две тысячи сорок один",obj.toString(1122041));
        Assertions.assertEquals("сто миллионов девятьсот тысяч",obj.toString(100900000));
    }
    @Test
    public void negativeNumberTest(){
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("минус один миллион",obj.toString(-1000000));
        Assertions.assertEquals("минус девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять",obj.toString(-999999999));
        Assertions.assertEquals("минус один миллион сто двадцать две тысячи сорок один",obj.toString(-1122041));
        Assertions.assertEquals("минус сто миллионов девятьсот тысяч",obj.toString(-100900000));
    }
    @Test
    public void doubleNumberTest() {
        NumberToString obj = new NumberToString();
        System.out.println(obj.toString(264.15));
        Assertions.assertEquals("двести шестьдесят четыре целых пятнадцать сотых", obj.toString(264.15));
        Assertions.assertEquals("ноль целых одна сотая", obj.toString(0.01));
        Assertions.assertEquals("минус двести шестьдесят четыре целых пятнадцать сотых", obj.toString(-264.15));
        Assertions.assertEquals("минус ноль целых одна сотая", obj.toString(-0.01));
    }
}
