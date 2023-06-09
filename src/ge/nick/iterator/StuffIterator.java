package ge.nick.iterator;

import java.util.Iterator;

public class StuffIterator implements Iterator<Stuff> {

    protected Stuff rootStuff;

    public StuffIterator(Stuff rootStuff) {

        this.rootStuff = rootStuff;
    }

    @Override
    public boolean hasNext() { return rootStuff != null; }

    @Override
    public Stuff next() {

        Stuff exist = this.rootStuff;
        this.rootStuff = this.rootStuff.getNextStuff();

        return exist;
    }
}
