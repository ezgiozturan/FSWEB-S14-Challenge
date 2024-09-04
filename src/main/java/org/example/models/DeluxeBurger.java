package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips = "CURVY";
    private String drink= "COKE";

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super("Deluxe Burger", meat, 19.10, breadRollType);
    }


    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String addition1Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger(){
        System.out.println("Name: " + super.getName());
        System.out.println("Meat: " + super.getMeat());
        System.out.println("BreadRollType: " + super.getBreadRollType());
        System.out.println("Price: " + super.getPrice());
        return super.getPrice();
    }
}
