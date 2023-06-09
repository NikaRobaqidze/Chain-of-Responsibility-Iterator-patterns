package ge.nick.iterator;

/**
 * Class prototype of restaurant stuff.
 * Described all data and opportunities of stuff.
 * Also keys and functions to implement stack principles.
 */

public class Stuff {

    protected String stuff; // Stuff name.
    protected double salary;

    protected Stuff nextStuff; // Node to next stuff.
    protected Stuff previousStuff; // Node to previous stuff.

    // Parametric constructor to set values.
    public Stuff(String stuff, double salary) {
        this.stuff = stuff;
        this.salary = salary;
    }

    // To get stuff name.
    public String getStuff() {
        return stuff;
    }

    // To get salary.
    public double getSalary() {
        return salary;
    }

    // To get node to next stuff.
    public Stuff getNextStuff() {
        return nextStuff;
    }

    // To get node to previous stuff.
    public Stuff getPreviousStuff() {
        return previousStuff;
    }

    // To set node to next stuff.
    public void setNextStuff(Stuff nextStuff) {
        this.nextStuff = nextStuff;
    }

    // To set node to previous stuff.
    public void setPreviousStuff(Stuff previousStuff) {
        this.previousStuff = previousStuff;
    }

    // To set stuff name.
    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    // To set salary.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "stuff='" + stuff + '\'' +
                ", salary=" + salary +
                '}';
    }
}
