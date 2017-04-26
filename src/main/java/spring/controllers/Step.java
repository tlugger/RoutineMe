package spring.controllers;
import org.springframework.stereotype.Controller;
/**
 * Created by Nhi on 4/11/17.
 */
@Controller
public class Step {
    private String stepText;
    private String stepImage;
    private boolean completed;
    private String type;

    Step(){
        this.stepText = "";
        this.stepImage = "";
        this.completed = false;
        this.type = "";
    }

    public String getStepText() {
        return stepText;
    }

    public String getStepImage() {
        return stepImage;
    }

    public void setStepText(String stepText) {
        this.stepText = stepText;
    }

    public void setStepImage(String stepImage) {
        this.stepImage = stepImage;
    }

}

