package ge.nick.changeOfResponse.utils;

import java.util.List;

public class Order {

    protected List<String> orderItems;
    protected boolean isReady;

    public Order(List<String> orderItems) {
        this.orderItems = orderItems;
        this.isReady = false;
    }

    public List<String> getOrderItems() {
        return orderItems;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
    }

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
