package main.java.orderingSystem.payment;

import java.util.UUID;

public class Payment {

    private String type;
    private UUID paymentID;
    private float totalAmount;

    public boolean makePayment(float amount) {
        return true;
    }
    public Payment getPayment() {
        return this;
    }
}
