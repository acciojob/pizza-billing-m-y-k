package com.driver;

public class Pizza {

    private int basePrice;

    private int totalPrice;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperBag;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){

        // your code goes here
        if (isVeg) {
            basePrice = 300;
            toppings = 70;
        }
        else {
            basePrice = 400;
            toppings = 120;
        }

        cheese = 80;

        paperBag = 20;

        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + totalPrice + "\n";

    }

    public int getBasePrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isCheeseAdded == false) {
            totalPrice += cheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded == false) {
            totalPrice += toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperBagAdded == false) {
            totalPrice += paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        /* Base Price Of The Pizza: 300
            Extra Cheese Added: 80
            Extra Toppings Added: 70
            Paperbag Added: 20
            Total Price: 470 */
        // price cheese toppings paperbag

        if (isCheeseAdded) {
            bill += "Extra Cheese Added: " + cheese + "\n";
        }
        if (isToppingsAdded) {
            bill += "Extra Toppings Added: " + toppings + "\n";
        }
        if (isPaperBagAdded) {
            bill += "Paperbag Added: " + paperBag + "\n";
        }

        bill += "Total Price: " + totalPrice + "\n";

        return this.bill;
    }
}
