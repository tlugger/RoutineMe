package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class Review {
    private String author;
    private String date;
    private String content;
    private int rating;

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public int getRating() {
        return rating;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void increseRating() {
        this.rating += 1;
    }

    public void decreaseRating(){ this.rating -= 1; }

}

