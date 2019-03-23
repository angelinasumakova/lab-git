package ai152.sumakova;

// Данный класс отвечает за позицию в чеке
// Class Item
public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод возвращает цену товара
    public double getPrice() {
        return price;
    }

    // Конвертация денежного значения в строку
    protected String priceToString(double value) {
        String result = "" + Math.abs(value);
        if (result.indexOf(".") == result.length() - 2) {
            result += "0";
        }
        result = result + " грн.";
        return result;
    }

    @Override
    public String toString() {
        return name + " " + priceToString(price);
    }
}
