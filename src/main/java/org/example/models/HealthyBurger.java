package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + super.name);
        System.out.println("Meat: " + "Tofu");
        System.out.println("BreadRollType: " + super.breadRollType);

        double totalPrice = super.price;

        if (super.addition1Name != null) {
            System.out.println("Addition1: " + super.addition1Name);
            totalPrice += super.addition1Price;
        }
        if (super.addition2Name != null) {
            System.out.println("Addition2: " + super.addition2Name);
            totalPrice += super.addition2Price;
        }
        if (super.addition3Name != null) {
            System.out.println("Addition3: " + super.addition3Name);
            totalPrice += super.addition3Price;
        }
        if (super.addition4Name != null) {
            System.out.println("Addition4: " + super.addition4Name);
            totalPrice += super.addition4Price;
        }

        if (healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + healthyExtra1Name);
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + healthyExtra2Name);
            totalPrice += healthyExtra2Price;
        }

        System.out.println("Price: " + String.format("%.2f", totalPrice));
        return totalPrice;
    }
}
