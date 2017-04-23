package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class ReviewCollection {
    private ArrayList<Review> collection;

    ReviewCollection(){
        Review review = new Review();
        this.collection.add(review);
    }
    public void sortByAuthor() { }
    public void sortByDate() { }
    public void sortByRating() { }
    public void addReview(Review review) { this.collection.add(review); }
    public void removeReview(Review review) { this.collection.remove(review); }
}

