package ai152.sumakova;

import java.util.Random;

public class ItemDiscount extends Item{

    private int discount;
    Random rand = new Random();

    public ItemDiscount(String name, double price){
        super(name, price);
        discount = rand.nextInt((int)price);
    }

    public double getDiscount(){
        return discount;
    }

    public String toString() {
        return super.toString() + " " + " Возможная скидка на товар: " + super.priceToString(discount);
    }
}
