package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineData {
    private int rating;
    private String difficulty;
    private String duration;

    public RoutineData() {

    }


    public RoutineData(int rating, String difficulty, String duration){
        this.rating = rating;
        this.difficulty = difficulty;
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDuration() {
        return duration;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void upvote(){
        this.rating = this.rating + 1;

    }
    public void downvote(User user){
        this.rating = this.rating - 1;

    }
    public void start(){

    }

}
