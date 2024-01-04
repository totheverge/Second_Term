import models.Order;

public class OrderObj {
    public static void main(String[] args) {
        String[] itemsOrder1 = {"572Brand: Karuna", "SuperBrand: SUPER"}; //Item code of ordered item
        int[] priceOrder1 = {1235, 2000}; //Item price of individual item in itemsOrder1
        String[] itemsOrder2 = {"SuperBrand: SUPER", "Dell Laptop: XPS"}; //Item code of ordered item
        int[] priceOrder2 = {2000,70000}; //Item price of individual item in itemsOrder1
        Order order1 = new Order("Mandip Lal Joshi", "9729387453", itemsOrder1, priceOrder1); //Create object name order1
        Order order2 = new Order("XYZ XYZ", "043757567455", itemsOrder2, priceOrder2); //Create object name order2


        order1.displayBill(); //Use the displayBill method to display the Customer Invoice of order1 object

        order2.displayBill(); //Use the displayBill method to display the Customer Invoice of order2 object

    }
}
