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

    public void setTitle(String title) {

    }

    public void setAuthor(String author) {

    }

    public void setDate(String date) {

    }

    public void setDescription(String description) {

    }
}
