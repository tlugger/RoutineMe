package spring.controllers;

/**
 * Created by josecanizares on 4/29/17.
 */
public class DraftBean {
    private String title;
    private String author;
    private String difficulty;
    private String duration;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getTitle() {
        return title;

    }

    public String getAuthor() {
        return author;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

}
