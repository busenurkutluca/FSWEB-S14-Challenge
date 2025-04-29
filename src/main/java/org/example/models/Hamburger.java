package org.example.models;


public class Hamburger {
    String name;
    private String meat;
    double price;
    String breadRollType;

    String addition1Name;
    double addition1Price;
    String addition2Name;
    double addition2Price;
    String addition3Name;
    double addition3Price;
    String addition4Name;
    double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);

        double totalPrice = price;

        if (addition1Name != null) {
            System.out.println("Addition1: " + addition1Name);
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Addition2: " + addition2Name);
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Addition3: " + addition3Name);
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            System.out.println("Addition4: " + addition4Name);
            totalPrice += addition4Price;
        }

        System.out.println("Price: " + String.format("%.2f", totalPrice));
        return totalPrice;
    }


}