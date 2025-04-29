package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.chips = "Curvy";
        this.drink = "Coke";
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + "Deluxe Burger");
        System.out.println("Meat: " + "Double");
        System.out.println("BreadRollType: " + "Double Sandwich");
        System.out.println("Price: " + String.format("%.2f", 19.10));
        return 19.10;
    }
}
