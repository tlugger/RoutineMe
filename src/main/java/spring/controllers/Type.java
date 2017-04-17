package spring.controllers;
import org.springframework.stereotype.Controller;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class Type {
    private String name;
    private int ranking;

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}

