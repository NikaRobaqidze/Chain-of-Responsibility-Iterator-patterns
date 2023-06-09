package ge.nick.iterator;

import java.util.Iterator;

public class RestaurantStuff {

    private Stuff rootStuff;

    public RestaurantStuff() {

        this.rootStuff = new Stuff("Dishwasher", 2312);

        addNewStuff(new Stuff("Host", 3032));
        addNewStuff(new Stuff("Pastry cook", 3071));
    }

    public void addNewStuff(Stuff stuff){

        stuff.setNextStuff(this.rootStuff);
        this.rootStuff.setPerviousStuff(stuff);

        this.rootStuff = stuff;
    }

    public Iterator<Stuff> createIterator() { return new StuffIterator(this.rootStuff); }

    @Override
    public String toString() {
        return "RestaurantStuff{" +
                "rootStuff=" + rootStuff +
                '}';
    }
}
