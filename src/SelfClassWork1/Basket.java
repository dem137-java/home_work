package SelfClassWork1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<GoodInBasket> goodsInBasketList=new ArrayList<>();

    public void addGoodToBasket (IGoods good, int qtty){
        goodsInBasketList.add(new GoodInBasket(good,qtty));
    }

    public List<GoodInBasket> getGoodsInBasketList() {
        return goodsInBasketList;
    }

    @Override
    public String toString() {
        return "Basket" + goodsInBasketList;
    }
}
