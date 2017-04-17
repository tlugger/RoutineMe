package spring.controllers;
import org.springframework.stereotype.Controller;


/**
 * Created by josecanizares on 4/16/17.
 */
@Controller
public class UserInfo {
    public String email;
    public String name;
    private String password;
    public int rating;
    public int userID;

    public String getPassword() {
        return password;
    }




}
