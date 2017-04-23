package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class ExerciseCollection {
    public ArrayList<Exercise> collection;

    ExerciseCollection(){
        Exercise exercise = new Exercise();
        this.collection.add(exercise);
    }
    public void addExercise(Exercise addExerciseValue) { this.collection.add(addExerciseValue); }
    public void removeExercise(String removeExerciseValue) { }

}