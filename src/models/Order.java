package models;

public class Order {
    String customerName;
    String phoneNumber;
    String[] items;
    int[] price;

    public Order(String customerName, String phoneNumber, String[] items, int[] price) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.price = price;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public void displayBill(){
        System.out.println("----- Customer Invoice -----");
        System.out.println("Item Code \t \t \t \t \t Price");
        int total=0;
        for (int i = 0;i<this.items.length;i++){
            System.out.println(this.items[i]+" \t \t \t "+this.price[i]);
            total += this.price[i];
        }
        System.out.println("\n");
        System.out.println("\t \t \t \t \t Total: "+total);
        float vatAmount;

        vatAmount = total*0.13f;
        System.out.println("\t \t \t \t \t VAT Amount: "+vatAmount);
        float amountDue = total+vatAmount;
        System.out.println("\t \t \t \t \t Amount Due:  "+amountDue);
    }
}
