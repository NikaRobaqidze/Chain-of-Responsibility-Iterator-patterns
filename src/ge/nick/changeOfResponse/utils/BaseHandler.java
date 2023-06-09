package ge.nick.changeOfResponse.utils;

public abstract class BaseHandler implements Handler {

    protected Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Order order) {

        if(this.next == null){

            throw new IllegalStateException("Error at request handling: " + order);
        }

        next.handle(order);
    }
}
