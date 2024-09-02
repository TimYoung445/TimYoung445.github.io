package design_patterns.observer; 

public class FanReads implements Observer() {
    private Subject subject; 
    private HashMap<Genre, ArrayList<Book>> book; 

    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        // subject.registerObserver(); //figure out what to put in ()
    }
    public update(Book book) {
        book.add(new Book(book))
    }
    public ArrayList<Book> getRecommendations(Genre genre) {
        return this.book[genre]; 
    }
}