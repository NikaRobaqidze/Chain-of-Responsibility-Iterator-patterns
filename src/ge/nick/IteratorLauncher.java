package ge.nick;

import ge.nick.iterator.RestaurantStuff;
import ge.nick.iterator.Stuff;

import java.util.Iterator;

public class IteratorLauncher {
    public static void main(String[] args) {

        RestaurantStuff restaurantStuff = new RestaurantStuff();
        Iterator<Stuff> iterator = restaurantStuff.createIterator();

        while (iterator.hasNext()) {

            final Stuff stuff = iterator.next();
            System.out.println(stuff);
        }

    }
}
