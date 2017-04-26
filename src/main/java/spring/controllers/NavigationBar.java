package spring.controllers;
import org.springframework.stereotype.Controller;
//import org.remast.swing.JSearchField
import javax.swing.JComboBox;
/**
 * Created by Nhi on 4/16/17.
 */
@Controller
public class NavigationBar {
    public JComboBox routineSearchField;
    public boolean peopleFilter;
    public boolean routineFilter;
    public String searchText;

    public String getSearchText() {
        return searchText;
    }

    public void onEnter() { }
}
