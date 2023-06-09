/**
 * @Author: Nika Robaqidze
 * @Email: nika42568@gmail.com

 * Scenario:
 * Data structure with Stack (First in - First out) principle.
 * It contains data of restaurant stuff.
 * Initialize this structure and iterator to print all of them.
 * Print all available stuff of restaurant.
 */

package ge.nick;

import ge.nick.iterator.RestaurantStuff;
import ge.nick.iterator.Stuff;

import java.util.Iterator;

public class IteratorLauncher {
    public static void main(String[] args) {

        // Initialize data structure of restaurant stuff.
        RestaurantStuff restaurantStuff = new RestaurantStuff();
        // Initialize iterator to move between stuff.
        Iterator<Stuff> iterator = restaurantStuff.createIterator();

        // Move between stuff until it is possible.
        while (iterator.hasNext()) {

            // Iterate and print stuff.
            final Stuff stuff = iterator.next();
            System.out.println(stuff);
        }
    }
}
