package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/11/17.
 */
@Controller
public class Exercise {
    private String title;
    private StepCollection stepCollection;
    private String type;

    public Exercise(){
        this.title = null;
        this.stepCollection = null;
        this.type = null;
    }

    public String getTitle() { return title; }
    public StepCollection getStepCollection() {
        return stepCollection;
    }
    public String getExerciseType() { return type; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setStepCollection(StepCollection stepCollection) {
        this.stepCollection = stepCollection;
    }
    public void setExerciseType(String type) { this.type = type; }
}