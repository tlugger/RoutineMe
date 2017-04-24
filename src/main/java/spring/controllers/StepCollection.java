package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/11/17.
 */

@Controller
public class StepCollection{
    private ArrayList<Step> collection;


    StepCollection(){
        Step step = new Step();
        this.collection.add(step);
    }

    public void addStep(Step step) { this.collection.add(step); }
    public void removeStep(Step step) { this.collection.remove(step);}
    public ArrayList<Step> getStepCollection() { return this.collection; }
}
