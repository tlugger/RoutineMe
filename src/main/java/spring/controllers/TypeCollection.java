package spring.controllers;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class TypeCollection {
    private ArrayList<Type> collection = new ArrayList<Type>();

    TypeCollection(){
        Type type = new Type();
        this.collection.add(type);
    }

    public void addType(Type type) { collection.add(type); }

    public void sortAlphbetically() { }

}