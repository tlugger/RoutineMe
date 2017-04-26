package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class UserCollection extends FeedItemFactory {
    public ArrayList<User> collection;
    public String collectionType;

    public void sortByEmail(){ }
    public void sortByRating() { }
    public void sortByUserID() { }
}