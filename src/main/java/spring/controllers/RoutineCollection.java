package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineCollection { /* extends FeedItemFactory{ */
    public List<Routine> collection;
    public List<Routine> tempSortedCollection;

    RoutineCollection(List<Routine> routineList){
        this.collection = routineList;
    }


    public List<Routine> sortNormal() {
        return collection;
    }

    public void sortByAuthor() {
        Collections.sort(collection, new Comparator<Routine>() {
            public int compare(Routine o1, Routine o2) {
                //Sorts by 'TimeStarted' property
                return o1.getRoutineHeader().getAuthor().compareTo(o2.getRoutineHeader().getAuthor());
            }
        });
    }

    public void addRoutine(Routine routine){
        this.collection.add(routine);
    }
    public void removeRoutine(Routine routine) {
        this.collection.remove(routine);
    }
}
