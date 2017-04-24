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
        Step step1 = new Step();
        Step step2 = new Step();
        Step step3 = new Step();
        this.title = "Single-Leg Romanian Dead-Lift";
        this.stepCollection = new StepCollection();
        this.type= "Weight";
        this.typeRanking = 7;

        step1.setStepText("Get two dumbbells of appropriate weight");
        step2.setStepText("Hold them in your hands and slowly lower as you raise your leg up and lean down with the weights.");
        step3.setStepText("Pull yourself back up and repeat for 3 sets of 6 reps per leg.");
        stepCollection.addStep(step1);
        stepCollection.addStep(step2);
        stepCollection.addStep(step3);




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