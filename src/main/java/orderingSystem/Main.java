package main.java.orderingSystem;

import main.java.orderingSystem.orders.Order;
import main.java.orderingSystem.payment.Card;
import main.java.orderingSystem.payment.Payment;
import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.product.Product;
import main.java.orderingSystem.payment.Cash;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Chair", 20, 20));
        products.add(new Product("Table", 50, 6));
        order.addToOrder(products);

        Customer customer = new Customer();
        customer.addDetails("John", "Main Street 1");
        order.setCustomer(customer);

        Payment payment = new Cash(100);
        order.setPayment(payment);
        boolean orderCompleted = order.finaliseOrder();
        if (orderCompleted) order.makeReceipt();
    }
}
