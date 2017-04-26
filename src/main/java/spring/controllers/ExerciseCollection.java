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
        this.collection = new ArrayList<Exercise>();
    }
    public void addExercise(Exercise exercise) {
        this.collection.add(exercise);
    }
    public void removeExercise(Exercise removeExerciseValue) {

        this.collection.remove(removeExerciseValue);
    }

    public ArrayList<Exercise> getCollection() { return this.collection; }

}