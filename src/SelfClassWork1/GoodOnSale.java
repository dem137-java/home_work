package SelfClassWork1;

import java.text.DecimalFormat;

public class GoodOnSale extends Good implements IGoods{
    private float rebate;

    public GoodOnSale(String name, float price, float rebate) {
        super(name, price);
        this.rebate = rebate;
    }

    public float getRebate() {
        return rebate;
    }

    public void setRebate(float rebate) {
        this.rebate = rebate;
    }

    @Override
    public String toString() {
        return super.getName() + ", Цена - " + new DecimalFormat("#.##").format(super.getPrice()) + ", Скидка - " + rebate + "%";
    }
}
