package SelfClassWork1;

import java.text.DecimalFormat;

public class GoodDecrValue extends GoodOnSale implements IGoods{
    private String rebateReason;

    public GoodDecrValue(String name, float price, float rebate, String rebateReason) {
        super(name, price, rebate);
        this.rebateReason = rebateReason;
    }

    public String getRebateReason() {
        return rebateReason;
    }

    public void setRebateReason(String rebateReason) {
        this.rebateReason = rebateReason;
    }

    @Override
    public String toString() {
        return super.getName() + ", Цена - " + new DecimalFormat("#.##").format(super.getPrice()) + ", Скидка - "
                + super.getRebate() + "%, Уценка - " + rebateReason;
    }
}
