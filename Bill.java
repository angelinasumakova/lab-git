package ai152.sumakova;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    // Список товаров
    private List<Item> receipt;
    protected double sum;

    public Bill() {
        receipt = new ArrayList<Item>();
        sum = 0.0;
    }

    // Добавить товар в чек
    public void add(Item i) {
        receipt.add(i);
        sum += i.getPrice();
    }

    // Распечатка чека
    public void printReceipt() {
        System.out.println(this);
    }

    // Перевод общей суммы в строковый формат
    private String sumToString() {
        double value = Math.rint(this.sum * 100) / 100.0;
        String result = "" + Math.abs(value);
        if (result.indexOf(".") == result.length() - 2) {
            result += "0";
        }
        return result + " грн.";
    }

    // Вывод списка товаров в строку
    public String receiptToString() {
        String build = "Товары:\n";
        for (int i = 0; i < receipt.size(); i++) {
            build += "   " + receipt.get(i);
            if (i != receipt.size() - 1) {
                build += "\n";
            }
        }
        return build;
    }

    @Override
    public String toString() {
        return receiptToString() + "\nВсего: " + sumToString();
    }
}

