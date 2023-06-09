package ge.nick.changeOfResponse.utils;

public interface Handler {

    void setNext(Handler next);
    void handle(Order order);
}
