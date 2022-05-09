package home_work_tests.test.HomeWork2;

import home_work_tests.source.HomeWork2.Task2_3.DoWhileOperation;
import home_work_tests.source.HomeWork2.Task2_3.ForEachOperation;
import home_work_tests.source.HomeWork2.Task2_3.ForOperation;
import home_work_tests.source.HomeWork2.Task2_3.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_3Test {

    @Test
    public void Task2_3DoWhileOperation(){
        DoWhileOperation obj = new DoWhileOperation();
        Assertions.assertEquals("1 2 3 4 5 6 7",obj.arrayPrintAll(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("1 3 5 7",obj.arrayPrintSecond(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("7 6 5 4 3 2 1",obj.arrayPrintReverse(new int[]{1,2,3,4,5,6,7}));;
    }
    @Test
    public void Task2_3WhileOperation(){
        WhileOperation obj = new WhileOperation();
        Assertions.assertEquals("1 2 3 4 5 6 7",obj.arrayPrintAll(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("1 3 5 7",obj.arrayPrintSecond(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("7 6 5 4 3 2 1",obj.arrayPrintReverse(new int[]{1,2,3,4,5,6,7}));;
    }
    @Test
    public void Task2_3ForEachOperation(){
        ForEachOperation obj = new ForEachOperation();
        Assertions.assertEquals("1 2 3 4 5 6 7",obj.arrayPrintAll(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("1 3 5 7",obj.arrayPrintSecond(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("7 6 5 4 3 2 1",obj.arrayPrintReverse(new int[]{1,2,3,4,5,6,7}));;
    }
    @Test
    public void Task2_3ForOperation(){
        ForOperation obj = new ForOperation();
        Assertions.assertEquals("1 2 3 4 5 6 7",obj.arrayPrintAll(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("1 3 5 7",obj.arrayPrintSecond(new int[]{1,2,3,4,5,6,7}));;
        Assertions.assertEquals("7 6 5 4 3 2 1",obj.arrayPrintReverse(new int[]{1,2,3,4,5,6,7}));;
    }




}
