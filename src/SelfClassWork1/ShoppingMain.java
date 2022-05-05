package SelfClassWork1;

public class ShoppingMain {
    public static void main(String[] args) {
        //создаем три товара
        Good good1 = new Good("Молоко",2.35f);
        GoodOnSale good2 = new GoodOnSale("Телевизор", 8536, 31);
        GoodDecrValue good3 = new GoodDecrValue("Бананы",10,50, "битые");

        System.out.println(good1.toString());
        System.out.println(good2.toString());
        System.out.println(good3.toString());

        //берем корзину

        Shop shop = new Shop();
        Basket basket = shop.getBasket();

        //добавляем их в корзину
        basket.addGoodToBasket(good1,4);
        basket.addGoodToBasket(good2,1);
        basket.addGoodToBasket(good3,15);

        System.out.println(basket.toString());

        //создаем магазин
        Receipt receipt = shop.getReceipt(basket);
        System.out.println(receipt.toString());
        ;


    }
}
