package P98_Practice.p26;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
