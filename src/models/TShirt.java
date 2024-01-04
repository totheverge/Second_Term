package models;

public class TShirt {
    String name;
    String productCode;
    int price;
    String brand;
    String description;
    String[] sizeProduct;

    public TShirt(String name, String productCode, int price, String brand, String description, String[] sizeProduct) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizeProduct = sizeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizeProduct() {
        return sizeProduct;
    }

    public void setSizeProduct(String[] sizeProduct) {
        this.sizeProduct = sizeProduct;
    }

    public void displayInfo(){
        System.out.println("-----Item Info-----");
        System.out.println("Item Name: "+this.name);
        System.out.println("Description: "+this.description);
        System.out.println("Product Code: "+this.productCode);
        System.out.println("Price: "+this.price);
        System.out.print("Size: ");
        for(int i=0;i<this.sizeProduct.length;i++){
            System.out.print(this.sizeProduct[i]+" ");
        }
        System.out.println("\n");

    }
}
