package ge.nick.changeOfResponse.utils;

import ge.nick.changeOfResponse.utils.BaseHandler;
import ge.nick.changeOfResponse.utils.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class Stuff extends BaseHandler {

    protected List<String> cookiesList;

    public Stuff() {

        cookiesList = new ArrayList<>();
    }

    public List<String> getCookiesList() {
        return this.cookiesList;
    }

    public void setCookiesList(List<String> cookiesList) {
        this.cookiesList = cookiesList;
    }

    @Override
    public void handle(Order order) {
        super.handle(order);
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "cookiesList=" + cookiesList +
                '}';
    }
}
