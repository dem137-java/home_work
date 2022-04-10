package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperations;

    public long getCountOperations() {
        return countOperations;
    }

    public void incrementCountOperation(){
        countOperations++;
    }


}
