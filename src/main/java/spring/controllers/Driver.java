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

    public void main(){
        User user = new User();
        user.login("chandra","chandra123");
    }
}
