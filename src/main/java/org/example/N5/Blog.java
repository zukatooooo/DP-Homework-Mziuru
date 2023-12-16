package org.example.N5;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private String posti;
    private List<Subscriber> subscribers;

    public Blog() {
        subscribers = new ArrayList<>();
    }

    public void addObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeObserver(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishArticle(String newArticle) {
        this.posti = newArticle;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}
