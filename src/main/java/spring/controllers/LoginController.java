package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Enter your email address to sign in or create an account on RoutineMe");
        return "login";
    }

    @RequestMapping(value = "/routine", method = RequestMethod.GET)
    public String goToRoutine(Model model, @RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("description") String description, @RequestParam("date") String date){
        model.addAttribute("title", title);
        model.addAttribute("author", author);
        model.addAttribute("date", date);
        model.addAttribute("description", description);
        return "routine";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean login) {
        if (login != null && login.getEmail() != null & login.getPassword() != null) {
            if (login.getEmail().equals("chandra") && login.getPassword().equals("chandra123")) {
                model.addAttribute("msg", "welcome" + login.getEmail());
                List<Routine> list = new ArrayList<Routine>();

                Routine routine = new Routine();
                RoutineHeader header = new RoutineHeader();
                Type type = new Type();
                TypeCollection collection = new TypeCollection();
                type.setName("Running");
                type.setRanking(100);
                collection.addType(type);
                header.setTitle("Dummy 1");
                header.setAuthor("Chandra");
                header.setDate("Today");
                header.setDescription("This workout is the bomb diggity");
                list.add(routine);
                list.add(routine);

                Routine routine2 = new Routine();
                RoutineHeader header2 = new RoutineHeader();
                TypeCollection collection2 = new TypeCollection();
                Type type2 = new Type();
                type.setName("Jogging");
                type.setRanking(100);
                collection2.addType(type2);
                header2.setTitle("Dummy 2");
                header2.setAuthor("Chandra");
                header2.setDate("Tomorrow");
                header2.setDescription("This workout is the bomb diggity");

                list.add(routine2);

                model.addAttribute("routines",list);
                return "routineFeed";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}