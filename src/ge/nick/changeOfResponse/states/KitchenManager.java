package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.List;

public class KitchenManager extends Stuff {

    @Override
    public void handle(Order order) {

        final List<String> orderItems = order.getOrderItems();

        if(orderItems.size() != 0){

            System.out.println("[Kitchen manager] Nobody could make next item(s):");

            for(int i = 0; i < orderItems.size(); i++){

                System.out.println(" - " + orderItems.get(i));
            }

            return;
        }

        order.setReady(true);
        super.handle(order);
    }
}
