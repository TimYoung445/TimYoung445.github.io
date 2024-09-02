package design_patterns.observer;

import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Overrride
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(title, genre, authorFirstName, authorLastName, description);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        // add a book based on info
        // notify observer
        Book book = new book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(book);
        notifyObserver(book);
    }

}