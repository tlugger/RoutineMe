package spring.controllers;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class RoutineCollection {
    public ArrayList<Routine> collection;
    public ArrayList<Routine> sortedCollection;


    public RoutineCollection() {
        this.collection = new ArrayList<Routine>();
    }

//    public RoutineCollection(ArrayList<Routine> routineList){
//        this.collection = routineList;
//    }


//    public ArrayList<Routine> sortNormal() {
//        return collection;
//    }

    public void sortByAuthor() {
        this.sortedCollection = this.collection;
        Collections.sort(this.sortedCollection, new Comparator<Routine>() {
            public int compare(Routine o1, Routine o2) {
                //Sorts by 'Author' property
                return o1.getRoutineHeader().getAuthor().compareTo(o2.getRoutineHeader().getAuthor());
            }
        });
    }

    public ArrayList<Routine> getCollection() { return this.collection; }
    public ArrayList<Routine> getSortedCollection() { return this.sortedCollection; }
    public void addRoutine(Routine routine){
        this.collection.add(routine);
    }
    public void removeRoutine(Routine routine) {
        this.collection.remove(routine);
    }
}
