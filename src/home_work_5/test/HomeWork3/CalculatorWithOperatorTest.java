package home_work_5.test.HomeWork3;

import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    CalculatorWithOperator calc = new CalculatorWithOperator();

    @Test
    public void divide (){
        Assertions.assertEquals(5.0,calc.divide(25,5));
        Assertions.assertEquals(0.0,calc.divide(0,5));
        Assertions.assertEquals(5.0,calc.divide(-25,-5));
        Assertions.assertEquals(-5.0,calc.divide(-25,5));
    }

    @Test
    public void multiply (){
        Assertions.assertEquals(125.0,calc.multiply(25,5));
        Assertions.assertEquals(0.0,calc.multiply(0,5));
        Assertions.assertEquals(125.0,calc.multiply(-25,-5));
        Assertions.assertEquals(-125.0,calc.multiply(-25,5));
    }
    @Test
    public void add (){
        Assertions.assertEquals(30.0,calc.add(25,5));
        Assertions.assertEquals(5.0,calc.add(0,5));
        Assertions.assertEquals(-30.0,calc.add(-25,-5));
        Assertions.assertEquals(-20.0,calc.add(-25,5));
    }
    @Test
    public void deduct (){
        Assertions.assertEquals(20.0,calc.deduct(25,5));
        Assertions.assertEquals(-5.0,calc.deduct(0,5));
        Assertions.assertEquals(-20.0,calc.deduct(-25,-5));
        Assertions.assertEquals(-30.0,calc.deduct(-25,5));
    }
    @Test
    public void pow (){
        Assertions.assertEquals(3125.0,calc.pow(5,5));
        Assertions.assertEquals(0.0,calc.pow(0,5));
        Assertions.assertEquals(0.04,calc.pow(-5,-2));
        Assertions.assertEquals(25.0,calc.pow(-5,2));
        Assertions.assertEquals(-3125.0,calc.pow(-5,5));
    }
    @Test
    public void abs (){
        Assertions.assertEquals(5.0,calc.abs(5));
        Assertions.assertEquals(0.0,calc.abs(0));
        Assertions.assertEquals(5,calc.abs(-5));
        Assertions.assertEquals(3125.0,calc.abs(-3125));
    }
    @Test
    public void sqrt (){
        Assertions.assertEquals(5.0,calc.sqrt(25));
        Assertions.assertEquals(0.0,calc.sqrt(0));
    }
}
