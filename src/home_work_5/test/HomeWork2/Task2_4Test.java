package home_work_5.test.HomeWork2;

import home_work_5.source.HomeWork2.Task2_4.ArraysTask_2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_4Test {
    int [] arr = new int[]{1,2,3,4,5,6,7};
    int [] arr2 = new int[]{-2,0,1,2,3,4,5};
    int [] arr3 = new int[]{0,0,0,0,0,0,0};
    int [] arr4 = new int[]{-5,-4,-3,-2,-1};

    @Test
    public void getSumEvenPositiveElements(){
        Assertions.assertEquals(12, ArraysTask_2_4.getSumEvenPositiveElements(arr));
        Assertions.assertEquals(6, ArraysTask_2_4.getSumEvenPositiveElements(arr2));
        Assertions.assertEquals(0, ArraysTask_2_4.getSumEvenPositiveElements(arr3));
        Assertions.assertEquals(0, ArraysTask_2_4.getSumEvenPositiveElements(arr4));
    }

    @Test
    public void getMaxOfEvenIndex(){
        Assertions.assertEquals(7, ArraysTask_2_4.getMaxOfEvenIndex(arr));
        Assertions.assertEquals(5, ArraysTask_2_4.getMaxOfEvenIndex(arr2));
        Assertions.assertEquals(0, ArraysTask_2_4.getMaxOfEvenIndex(arr3));
        Assertions.assertEquals(-1, ArraysTask_2_4.getMaxOfEvenIndex(arr4));
    }
    @Test
    public void getIndexLessThanArithmetics (){
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, ArraysTask_2_4.getIndexLessThanArithmetics(arr));
        Assertions.assertArrayEquals(new int[]{0, 1}, ArraysTask_2_4.getIndexLessThanArithmetics(arr2));
        Assertions.assertArrayEquals(new int[]{}, ArraysTask_2_4.getIndexLessThanArithmetics(arr3));
        Assertions.assertArrayEquals(new int[]{0, 1}, ArraysTask_2_4.getIndexLessThanArithmetics(arr4));
    }
    @Test
    public void getTwoMinElements (){
        Assertions.assertArrayEquals(new int[]{1, 2}, ArraysTask_2_4.getTwoMinElements(arr));
        Assertions.assertArrayEquals(new int[]{-2, 0}, ArraysTask_2_4.getTwoMinElements(arr2));
        Assertions.assertArrayEquals(new int[]{0, 0}, ArraysTask_2_4.getTwoMinElements(arr3));
        Assertions.assertArrayEquals(new int[]{-5, -4}, ArraysTask_2_4.getTwoMinElements(arr4));
    }
    @Test
    public void getSumOfArrayFigures (){
        Assertions.assertEquals(28, ArraysTask_2_4.getSumOfArrayFigures(arr));
        Assertions.assertEquals(17, ArraysTask_2_4.getSumOfArrayFigures(arr2));
        Assertions.assertEquals(0, ArraysTask_2_4.getSumOfArrayFigures(arr3));
        Assertions.assertEquals(15, ArraysTask_2_4.getSumOfArrayFigures(arr4));
    }
    @Test
    public void getCompressedArray (){
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, ArraysTask_2_4.getCompressedArray(arr,1,4));
        Assertions.assertArrayEquals(new int[]{3, 4, 5}, ArraysTask_2_4.getCompressedArray(arr2,-2,2));
        Assertions.assertArrayEquals(new int[]{}, ArraysTask_2_4.getCompressedArray(arr3,0,0));
        Assertions.assertArrayEquals(new int[]{-5, -4}, ArraysTask_2_4.getCompressedArray(arr4,-3,-1));
    }

}



