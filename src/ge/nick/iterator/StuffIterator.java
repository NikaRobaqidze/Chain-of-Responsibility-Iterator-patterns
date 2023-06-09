package ge.nick.iterator;

import java.util.Iterator;

/**
 * Iterator class work (iterate) stuff of restaurant.
 * Override functions to move between stuffs.
 * Implement Java Iterator interface.
 */

public class StuffIterator implements Iterator<Stuff> {

    // Root stuff to begin iterate.
    protected Stuff rootStuff;

    // Parametric constructor to set value.
    public StuffIterator(Stuff rootStuff) {

        this.rootStuff = rootStuff;
    }

    // Check if stuff object have node to next.
    @Override
    public boolean hasNext() { return rootStuff != null; }

    // Set next stuff.
    @Override
    public Stuff next() {

        // Temporary node to return it and set next.
        Stuff exist = this.rootStuff;
        this.rootStuff = this.rootStuff.getNextStuff();

        return exist;
    }
}
