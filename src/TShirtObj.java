import models.TShirt;

public class TShirtObj {
    public static void main(String[] args) {

        String[] size1 = {"XL", "Medium", "Small"}; //Available size for item1 object
        String[] size2 = {"Medium", "Small"}; //Available size for item2 object
        TShirt item1 = new TShirt("Gorkhali Batman", "572Brand: Karuna", 1235,"572Brand", "Graphic text: You either die a hero or live long enough to see yourself be a villain", size1); //Create object named item1
        TShirt item2 = new TShirt("Superman", "SuperBrand: SUPER", 2000,"SuperBrand", "Graphic text: SuperMan is Here", size2); //Create object name item2
        item1.displayInfo(); //Use the method displayInfo to get item1 information
        item2.displayInfo(); //Use the method displayInfo to get item2 information
    }
}