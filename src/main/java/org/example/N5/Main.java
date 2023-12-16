package org.example.N5;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("mixaili");
        Subscriber subscriber2 = new Subscriber("tope");
        Blog blog = new Blog();

        blog.addObserver(subscriber1);
        blog.addObserver(subscriber2);

        blog.publishArticle("axali posti on Blog 1");
        blog.publishArticle("uaxlesi posti on Blog 1");
    }
}
