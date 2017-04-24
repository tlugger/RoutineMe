package spring.controllers;
import org.springframework.stereotype.Controller;


/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class Driver {
    public User user;
    public Feed feed;
    public NavigationBar navBar;

    public void createRoutine(User user) {
        Routine routine = new Routine();
    }
    public void createReview(User user) { }
    public void createDraft(User user) { }

    public void main(){
        User user = new User();
        user.login("chandra","chandra123");
        createRoutine(user);

    }
}
