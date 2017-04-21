package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineHeader {
    private String title;
    private String author;
    private String date;
    private String description;

    RoutineHeader(){
        this.title = "";
        this.author = "";
        this.date = "";
        this.description = "";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) { this.title = title;}

    public void setAuthor(String author) { this.author = author; }

    public void setDate(String date) { this.date = date; }

    public void setDescription(String description) { this.description = description; }
}
