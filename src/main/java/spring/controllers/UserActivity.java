package spring.controllers;
import org.springframework.stereotype.Controller;


/**
 * Created by josecanizares on 4/16/17.
 */
@Controller
public class UserActivity {
    public RoutineCollection createdRoutines;
    public RoutineCollection followingRoutines;
    public DraftCollection drafts;

    public void addCreatedRoutine(Routine routine) {
        createdRoutines.addRoutine(routine);
    }
    public void addFollowedRoutine(Routine routine) {
        followingRoutines.addRoutine(routine);
    }
}
