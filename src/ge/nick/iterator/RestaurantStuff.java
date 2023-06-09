package ge.nick.iterator;

import java.util.Iterator;

/**
 * Data structure class to save and work with restaurant stuff.
 * Class includes to add and move between people. (stuff)
 * Data structure implemented Stack (First in - First out) principles.
 * Use Java Iterator to move between.
 */

public class RestaurantStuff {

    // Root stuff to begin iterating.
    private Stuff rootStuff;

    // Default constructor to set default value.
    public RestaurantStuff() {

        // Set stuff by default.

        this.rootStuff = new Stuff("Dishwasher", 2312);

        addNewStuff(new Stuff("Host", 3032));
        addNewStuff(new Stuff("Pastry cook", 3071));
    }

    // Add new stuff. Add new node to next stuff.
    public void addNewStuff(Stuff stuff){

        // Initialize and set new node to stuff.
        stuff.setNextStuff(this.rootStuff);
        this.rootStuff.setPreviousStuff(stuff);

        // Update root stuff.
        this.rootStuff = stuff;
    }

    // To create iterator to move between stuff.
    public Iterator<Stuff> createIterator() { return new StuffIterator(this.rootStuff); }

    @Override
    public String toString() {
        return "RestaurantStuff{" +
                "rootStuff=" + rootStuff +
                '}';
    }
}
