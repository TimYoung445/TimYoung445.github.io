package design_patterns.observer;

public class Store implements Observer {
    private Subject subject;
    private String title = "";
    private Queue<Book> bestSellers;
}

// store keeps track of the bestsellers
public void update(Book book) {

}

public List<Book> getBestSellers() {

}