package main.java.orderingSystem.payment;

public class Cash extends Payment {
    private float amountGiven;

    public Cash(Integer amountGiven) {
        this.amountGiven = amountGiven;
    }

    @Override
    public boolean makePayment(float amount) {
        // return change
        float change = amountGiven - amount;
        if (change < 0) {
            System.out.println("Not enough money! Missing: " + change);
            return false;
        }
        System.out.println("Order paid! Here's your change: " + change);
        return true;
    }
}
