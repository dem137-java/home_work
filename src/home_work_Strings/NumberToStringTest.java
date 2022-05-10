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
        Assertions.assertEquals("двести шестьдесят четыре целых пятнадцать сотых", obj.toString(264.15));
        Assertions.assertEquals("ноль целых одна сотая", obj.toString(0.01));
        Assertions.assertEquals("минус двести шестьдесят четыре целых пятнадцать сотых", obj.toString(-264.15));
        Assertions.assertEquals("минус ноль целых одна сотая", obj.toString(-0.01));
        Assertions.assertEquals("минус тридцать две тысячи восемьсот шестьдесят пять целых двадцать три сотые",obj.toString(-32865.23));
    }
    @Test
    public void toWeekTest() {
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("0 недель", obj.toWeek(5));
        Assertions.assertEquals("2 недели", obj.toWeek(14));
        Assertions.assertEquals("4 недели", obj.toWeek(28));
        Assertions.assertEquals("25 недель", obj.toWeek(177));
        Assertions.assertEquals("1 неделя", obj.toWeek(9));
    }
    @Test
    public void toHoursMinuteSecondMillisecond() {
        NumberToString obj = new NumberToString();
        Assertions.assertEquals("02:09:49.001", obj.toHoursMinuteSecondMillisecond(7789001,true));
        Assertions.assertEquals("2 часа 9 минут 49 секунд 1 миллисекунда", obj.toHoursMinuteSecondMillisecond(7789001,false));
    }
}
