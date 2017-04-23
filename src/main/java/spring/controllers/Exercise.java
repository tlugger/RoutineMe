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
    private int typeRanking;

    Exercise(){
        this.title = "";
        this.stepCollection = new StepCollection();
        this.type= "";
    }

    public String getTitle() { return title; }
    public StepCollection getStepCollection() {
        return stepCollection;
    }
    public String getExerciseType() { return type; }
    public int getTypeRanking() { return typeRanking; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setStepCollection(StepCollection stepCollection) {
        this.stepCollection = stepCollection;
    }
    public void setExerciseType(String type) { this.type = type; }
    public void setTypeRanking(int type) { this.typeRanking = typeRanking; }
}