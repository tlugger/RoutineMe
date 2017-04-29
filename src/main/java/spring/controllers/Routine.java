package spring.controllers;

/**
 * Created by Nhi on 4/16/17.
 */
public class Routine {
    private RoutineHeader header;
    private String type;
    private ExerciseCollection exercises;
    private ReviewCollection reviews;
    private RoutineData data;

    public Routine() {
        this.header = null;
        this.exercises = null;
        this.reviews = null;
        this.type = null;
        this.data = null;
    }


    public Routine( RoutineHeader header, ExerciseCollection exercises, ReviewCollection reviews, String type, RoutineData data){
        this.header = header;
        this.exercises = exercises;
        this.reviews = reviews;
        this.type = type;
        this.data = data;
    }


    //wrappers
    public String getTitle() {
        return this.header.getTitle();
    }
    public String getAuthor() {
        return this.header.getAuthor();
    }
    public String getDate() {
        return this.header.getDate();
    }
    public String getDescription() {
        return this.header.getDescription();
    }

    public String getDuration() {
        return this.data.getDuration();
    }
    public int getRating() {
        return this.data.getRating();
    }
    public String getDifficulty() {
        return this.data.getDifficulty();
    }

    public void upvote() {
//        System.out.println("What is this?" + this.data);
        this.data.upvote();
    }

    public void downvote() {
        this.data.upvote();
    }


    public RoutineHeader getRoutineHeader(){return this.header;}

    public String getType(){
        return this.type;
    }

    public ExerciseCollection getExercises() { return this.exercises; }
    public ReviewCollection getReviews() { return this.reviews; }

    public void setRoutineHeader(RoutineHeader header) {
        this.header = header;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(RoutineData data) {
        this.data = data;
    }

    public void setExerciseCollection(ExerciseCollection exercises) { this.exercises = exercises; }

    public void setReviewCollection(ReviewCollection reviews) { this.reviews = reviews; }

    public void setTitle(String title) {
        this.header.setTitle(title);
    }
    public void setAuthor(String author) {
        this.header.setAuthor(author);
    }
    public void setDate(String date){
        this.header.setDate(date);
    }
    public void setDescription(String description) {
        this.header.setDescription(description);
    }

}
