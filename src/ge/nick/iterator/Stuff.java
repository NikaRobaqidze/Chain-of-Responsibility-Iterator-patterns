package ge.nick.iterator;

public class Stuff {

    protected String stuff;
    protected double salary;

    protected Stuff nextStuff;
    protected Stuff perviousStuff;

    public Stuff(String stuff, double salary) {
        this.stuff = stuff;
        this.salary = salary;
    }

    public String getStuff() {
        return stuff;
    }

    public double getSalary() {
        return salary;
    }

    public Stuff getNextStuff() {
        return nextStuff;
    }

    public Stuff getPerviousStuff() {
        return perviousStuff;
    }

    public void setNextStuff(Stuff nextStuff) {
        this.nextStuff = nextStuff;
    }

    public void setPerviousStuff(Stuff perviousStuff) {
        this.perviousStuff = perviousStuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

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
