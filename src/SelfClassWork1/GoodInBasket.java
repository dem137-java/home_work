package SelfClassWork1;

public class GoodInBasket {
    private IGoods good;
    private int qtty;
    private float sum;

    public GoodInBasket(IGoods good, int qtty) {
        this.good = good;
        this.qtty = qtty;
        if (good instanceof GoodOnSale){
            this.sum = (good.getPrice() - good.getPrice()*(((GoodOnSale) good).getRebate()/100))*qtty;
        } else if (good instanceof GoodDecrValue){
            this.sum = (good.getPrice() - good.getPrice()*(((GoodDecrValue) good).getRebate()/100))*qtty;
        }else {
            this.sum = good.getPrice()*qtty;
        }
    }

    public IGoods getGood() {
        return good;
    }

    public void setGood(IGoods good) {
        this.good = good;
    }

    public int getQtty() {
        return qtty;
    }

    public void setQtty(int qtty) {
        this.qtty = qtty;
    }

    public float getSum() {
        return sum;
    }


    @Override
    public String toString() {
        if (good instanceof GoodOnSale){
            return ((GoodOnSale) good).toString();
        } else if (good instanceof GoodDecrValue){
            return ((GoodDecrValue) good).toString();
        }else {
            return good.toString();
        }
    }
}
