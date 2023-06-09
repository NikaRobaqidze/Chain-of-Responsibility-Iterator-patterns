package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.List;

/**
 * Class imitate Waiter stuff of the restaurant.
 * Stuff that take order then get created list of items to the other stuff.
 * Create order list and response to user
 * check if order is not empty to continue (change response).
 * Waiter is first, default, state.
 */

public class Waiter extends Stuff {

    @Override
    public void handle(Order order) {

        // List of items from client.
        final List<String> orderItems = order.getOrderItems();

        // Check if order ready to work.
        if(order.isReady()){

            System.out.println("[Waiter] Order is ready to get to client.");
            return;
        }

        // Check if order is empty.
        if(orderItems.size() == 0){

            System.out.println("[Waiter] Empty order.");
            return;
        }

        // Change of response.
        super.handle(order);
    }
}
