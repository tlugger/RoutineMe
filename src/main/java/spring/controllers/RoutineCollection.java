package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineCollection extends FeedItemFactory{
    public ArrayList<Routine> collection;
    public String collectionType;

    public void addRoutine(Routine routine){ }
    public void sortByAuthor() { }
    public void removeRoutine(Routine routine) { }
}
