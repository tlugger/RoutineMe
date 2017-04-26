package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class User {
    private UserInfo info;
    private UserActivity activity;
    private UserPresentation presentation;

    public User() {

        this.info = null;
        this.activity = null;
        this.presentation = null;
    }

    public void login(String email, String password){ }
    public void signUp(String email, String password) { }
    public void dbValidate(String email, String password) { }

    public UserInfo getInfo() {
        return info;
    }

    public UserActivity getActivity() {
        return activity;
    }

    public UserPresentation getPresentation() {
        return presentation;
    }

    public void updateInfo(UserInfo info) {
        this.info = info;
    }

    public void updateActivity(UserActivity activity) {
        this.activity = activity;
    }

    public void updatePresentation(UserPresentation presentation) {
        this.presentation = presentation;
    }

    public void addCreatedRoutine(Routine routine) {
        this.activity.addCreatedRoutine(routine);
    }

    public void addFollowedRoutine(Routine routine) {
        this.activity.addFollowedRoutine(routine);
    }

}
