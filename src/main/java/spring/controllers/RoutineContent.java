package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineContent {
    private ExerciseCollection exerciseCollection;
    private TypeCollection typeCollection;
    private ReviewCollection reviewCollection;

    public void addExercise(Exercise exercise) { this.exerciseCollection.addExercise(exercise); }
    public void addType(Type type) { }
    public void addReview(Review review) { this.reviewCollection.(review);}
}

