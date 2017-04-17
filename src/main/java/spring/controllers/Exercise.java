package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/11/17.
 */
@Controller
public class Exercise {
    private String title;
    private StepCollection stepCollection;

    public String getTitle() {
        return title;
    }

    public StepCollection getStepCollection() {
        return stepCollection;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStepCollection(StepCollection stepCollection) {
        this.stepCollection = stepCollection;
    }
}