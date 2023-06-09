package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.List;

public class Waiter extends Stuff {

    @Override
    public void handle(Order order) {

        final List<String> orderItems = order.getOrderItems();

        if(order.isReady()){

            System.out.println("[Waiter] Order is ready to get to client.");
            return;
        }

        if(orderItems.size() == 0){

            System.out.println("[Waiter] Empty order.");
            return;
        }

        super.handle(order);
    }
}
