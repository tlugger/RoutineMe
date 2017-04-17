package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class DraftCollection {
    public ArrayList<Routine> collection;
    public String collectionType;

    public void addRoutine(Routine routine) { }
    public void addRoutine(Type type) { }
}
