package design_patterns.observer;

import java.util.Arraylist;

public class Book implements Subject {
    String title = "";
    Genre genre; 
    String authorFirstName = "";
    String authorLastName = "";
    String description = "";

    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    //Getters
    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        system.out.println("----- "+this.title+"-----"\n+this.genre+" by: "+this.authorFirstName+" "+this.authorLastName\n+this.description);
    }




    





}