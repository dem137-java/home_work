package SelfClassWork1;

import java.text.DecimalFormat;

public class Good implements IGoods{
    private String name;
    private float price;

    public Good(String name, float price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + new DecimalFormat("#.##").format(price);
    }
}
