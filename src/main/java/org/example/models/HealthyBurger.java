package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name,  double price,String meat ,String breadRollType) {
        super(name,
                "Tofu",
                price,
                breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        healthyExtra1Name= this.healthyExtra1Name;
        healthyExtra1Price = this.healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        healthyExtra2Name= this.healthyExtra2Name;
        healthyExtra2Price = this.healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Addition 1: " + healthyExtra1Name);

        }

        if (this.healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Addition 2: " + healthyExtra2Name);
        }

        System.out.println("Price: " + hamburgerPrice);
        return hamburgerPrice;
    }
}
