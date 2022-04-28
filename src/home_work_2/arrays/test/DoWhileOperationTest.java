package home_work_2.arrays.test;

import home_work_2.arrays.task2_3.DoWhileOperation;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {

    @Test
    public void PrintAll(){
        int [] arr = new int []{1,2,3,4,5,6,7,8,9};
        DoWhileOperation oper = new DoWhileOperation();

        oper.arrayPrintAll(arr);
    }
}
