package design_patterns.observer;

public class Store implements Observer {
    private Subject subject;
    private String title = "";
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(); //figure out what to put inn ()
    }

    // store keeps track of the bestsellers
    public void update(Book book) {
        if (bestSellers.size() >= 5) { //maximum value is 5
            bestSellers.poll(); //retrieves and removes head of the queue
        }
        bestSellers.add(book);
    }

    public List<Book> getBestSellers() {
        return this.bestSellers; 
    }   



}