package spring.controllers.User;

/**
 * Created by josecanizares on 4/16/17.
 */
public class UserActivity {
    public ProgressData progressData;
    public RoutineCollection routinesCreated;
    public RoutineCollection routineFollowed;
    public DraftCollection drafts;

    public addCreatedRoutine(Routine routine) {
        routinesCreated.addRoutine(routine);
    }
    public addFollowedRoutine(Routine routine) {
        routinesFollowed.addRoutine(routine);
    }
}
