package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineBar {
    private String rating;
    private String difficulty;
    private String duration;

    public String getRating() {
        return rating;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDuration() {
        return duration;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void upvote(User user){

    }
    public void downvote(User user){

    }
    public void start(User user){

    }

}
