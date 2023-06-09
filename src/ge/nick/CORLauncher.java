package ge.nick;

import ge.nick.changeOfResponse.states.*;
import ge.nick.changeOfResponse.utils.Handler;
import ge.nick.changeOfResponse.utils.Order;

import java.util.ArrayList;
import java.util.List;

public class CORLauncher {
    public static void main(String[] args) {

        Handler waiter = new Waiter();

        Handler cooksChef = new Cookschef();
        Handler sousChef = new Souschef();
        Handler pastryChef = new Pastrychef();

        Handler kitchenManager = new KitchenManager();

        waiter.setNext(cooksChef);
        cooksChef.setNext(sousChef);
        sousChef.setNext(pastryChef);
        pastryChef.setNext(kitchenManager);
        kitchenManager.setNext(waiter);

        List<String> orderItems = new ArrayList<>();
        orderItems.add("Chocolate Chip Cookies");
        orderItems.add("Taco Sauce");
        orderItems.add("Florentine tarts");
        //orderItems.add("Xinkali");

        Order order = new Order(orderItems);
        waiter.handle(order);
    }
}
