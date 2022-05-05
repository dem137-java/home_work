package SelfClassWork1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<IGoods> shopListOfGoods = new ArrayList();

    public void addGoodToShop(IGoods good){
        shopListOfGoods.add(good);
    }

    public List<IGoods> getShopListOfGoods() {
        return shopListOfGoods;
    }

    public Basket getBasket(){
        return new Basket();
    }

    public Receipt getReceipt(Basket basket){
        float totalSum=0;
        List <String> listOfGoods = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (GoodInBasket g : basket.getGoodsInBasketList()) {
            builder.append(g.toString());
            builder.append(", Количество - ");
            builder.append(g.getQtty());
            builder.append(", Сумма со скидкой - ");
            builder.append(g.getSum());
            totalSum+=g.getSum();
            listOfGoods.add(builder.toString());
            builder.delete(0,builder.length());
        }
        return new Receipt(listOfGoods,totalSum);
    }

}
