package ai152.sumakova;

public class BillDiscount extends Bill{

    private double discountSum;
    private String client;
    private boolean checkClient;

    public BillDiscount(String surname){
        super();
        discountSum = 0.0;
        client = surname;
        checkClient = false;
    }

    public void add(ItemDiscount i) {
        super.add(i);
        if(checkClientFunction()){
            discountSum += i.getDiscount();
            super.sum -=  i.getDiscount();
            checkClient = true;
        }
    }

    //получение фамилии постоянного клиента
    public String getClientSurname(){
        return client;
    }

    //проверка на постоянного клиента
    private boolean checkClientFunction(){
        if(client == "Сумакова")
            return true;
        return false;
    }

    public String toString(){
        if(checkClient){
            return "\nПостоянный клиент: " + client + "\n" +
                    super.toString() + "\nСкидка: " + discountSum + "грн.";
        } else {
            return "\nКлиент: " + client + "\n" +
                    super.toString() + "\nСкидка: " + discountSum + "грн.";
        }
    }
}
