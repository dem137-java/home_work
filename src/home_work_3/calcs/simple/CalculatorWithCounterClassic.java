package home_work_3.calcs.simple;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long countOperations;

    public long getCountOperations() {
        return countOperations;
    }

    public void incrementCountOperation(){
        countOperations++;
    }


}
