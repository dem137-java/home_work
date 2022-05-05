package SelfClassWork1;

import java.util.List;

public class Receipt {
    private List<String> goodsListInReceipt;
    private float sumTotal;

    public Receipt(List<String> goodsListInReceipt, float sumTotal) {
        this.goodsListInReceipt = goodsListInReceipt;
        this.sumTotal = sumTotal;
    }

    public List<String> getGoodsListInReceipt() {
        return goodsListInReceipt;
    }

    public float getSumTotal() {
        return sumTotal;
    }

    @Override
    public String toString() {
        int i = 1;
        StringBuilder builder = new StringBuilder();
        builder.append("-------");
        for (String s : goodsListInReceipt) {
            builder.append("\n");
            builder.append(i++);
            builder.append(". ");
            builder.append(s);
        }
        builder.append("\n-------");
        builder.append("\nИтого нужно заплатить: ");
        builder.append(sumTotal);

        return builder.toString();
    }
}
