package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.ArrayList;
import java.util.List;

public class Souschef extends Stuff {

    public Souschef() {

        List<String> SouschefList = new ArrayList<>();

        SouschefList.add("Soy Sauce");
        SouschefList.add("Taco Sauce");
        SouschefList.add("Tartar Sauce");

        setCookiesList(SouschefList);
    }

    @Override
    public void setCookiesList(List<String> cookiesList) {
        super.setCookiesList(cookiesList);
    }

    @Override
    public void handle(Order order) {

        final List<String> orderItems = order.getOrderItems();
        final List<String> cheffItems = super.getCookiesList();

        for(int i = 0; i < orderItems.size(); i++){

            final String item = orderItems.get(i);

            if(cheffItems.contains(item)){

                System.out.println("Sous-chef will make " + item);

                orderItems.remove(i);
                order.setOrderItems(orderItems);
            }
        }

        super.handle(order);
    }
}
