package ge.nick.changeOfResponse.utils;

import java.util.List;

/**
 * Class for working with items of order in restaurant.
 * It is base list of string.
 * Additional function is check is order is ready.
 */

public class Order {

    // List of string items of order.
    protected List<String> orderItems;
    // Is order ready to work.
    protected boolean isReady;

    // Parametric constructor to set list.
    public Order(List<String> orderItems) {
        this.orderItems = orderItems;
        this.isReady = false;
    }

    // To get list of order items.
    public List<String> getOrderItems() {
        return orderItems;
    }

    // Is order ready to work.
    public boolean isReady() {
        return isReady;
    }

    // To set list of order items.
    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
    }

    // To set order ready status.
    public void setReady(boolean ready) {
        isReady = ready;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }
}
