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

    public void setCollection(ArrayList<Routine> collection) {
        this.collection = collection;
    }

    public void setSortedCollection(ArrayList<Routine> sortedCollection) {
        this.sortedCollection = sortedCollection;
    }

    public ArrayList<Routine> sortedCollection;


    public RoutineCollection() {
        this.collection = new ArrayList<Routine>();
    }


    public ArrayList<Routine> sortByAuthor() {
        this.sortedCollection = this.collection;
        Collections.sort(this.sortedCollection, new Comparator<Routine>() {
            public int compare(Routine o1, Routine o2) {
                //Sorts by 'Author' property
                return o1.getRoutineHeader().getAuthor().compareTo(o2.getRoutineHeader().getAuthor());
            }
        });
        return this.sortedCollection;
    }

    public ArrayList<Routine> sortByTitle() {
        this.sortedCollection = this.collection;
        Collections.sort(this.sortedCollection, new Comparator<Routine>() {
            public int compare(Routine o1, Routine o2) {
                //Sorts by 'Author' property
                return o1.getRoutineHeader().getTitle().compareTo(o2.getRoutineHeader().getTitle());
            }
        });
        return this.sortedCollection;
    }

    public ArrayList<Routine> sortByDate() {
        this.sortedCollection = this.collection;
        Collections.sort(this.sortedCollection, new Comparator<Routine>() {
            public int compare(Routine o1, Routine o2) {
                //Sorts by 'Author' property
                return -1*(o1.getRoutineHeader().getDate().compareTo(o2.getRoutineHeader().getDate()));
            }
        });
        return this.sortedCollection;
    }

    public ArrayList<Routine> filterByRoutineTypeOnlyMixed() {
        this.sortedCollection = this.collection;
        for (Routine oneRoutine : this.collection) {
            if (oneRoutine.getType().equals("Strength") || oneRoutine.getType().equals("Cardio")) {
                this.sortedCollection.remove(oneRoutine);
            }
        }
        return this.sortedCollection;
    }

    public ArrayList<Routine> filterByRoutineTypeOnlyStrength() {
        this.sortedCollection = this.collection;
        for (Routine oneRoutine : this.collection) {
            if (oneRoutine.getType().equals("Mixed") || oneRoutine.getType().equals("Cardio")) {
                this.sortedCollection.remove(oneRoutine);
            }
        }
        return this.sortedCollection;
    }

    public ArrayList<Routine> getCollection() { return this.collection; }
    public ArrayList<Routine> getSortedCollection() { return this.sortedCollection; }
    public void addRoutine(Routine routine){ this.collection.add(routine); }
    public void removeRoutine(Routine routine) {
        this.collection.remove(routine);
    }
}
