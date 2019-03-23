package ai152.sumakova;

// Class Main
// branch new_f
// branch master
public class Main {

    public static void main(String[] args) {
        // продукты
        Item tomato   = new Item("Помидоры", 9.0d);
        Item cucumber = new Item("Огурцы", 9.0d);
        Item onion    = new Item("Лук", 3.0d);

        Bill bill = new Bill();
        bill.add(tomato);
        bill.add(cucumber);
        bill.add(onion);

        bill.printReceipt();


        // техника
        ItemDiscount tablet   = new ItemDiscount("Планшет", 1000.0d);
        ItemDiscount phone    = new ItemDiscount("Смартфон", 1200.0d);
        ItemDiscount computer = new ItemDiscount("Компьютер", 5200.0d);

        BillDiscount bill_2 = new BillDiscount("Сумакова");
        BillDiscount bill_3 = new BillDiscount("Иванов");

        bill_2.add(tablet);
        bill_2.add(phone);
        bill_2.add(computer);

        bill_2.printReceipt();

        bill_3.add(tablet);
        bill_3.add(phone);
        bill_3.add(computer);

        bill_3.printReceipt();
    }
}
