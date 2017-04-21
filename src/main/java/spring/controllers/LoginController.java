package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Enter your email address to sign in or create an account on RoutineMe");
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean login) {
        if (login != null && login.getEmail() != null & login.getPassword() != null) {
            if (login.getEmail().equals("chandra") && login.getPassword().equals("chandra123")) {
                model.addAttribute("msg", "welcome" + login.getEmail());
                List<Routine> list = new ArrayList<Routine>();
                RoutineHeader header = new RoutineHeader();
                Type type = new Type();
                type.setName("Running");
                type.setRanking(100);
                TypeCollection collection = new TypeCollection();
                collection.addType(type);
                header.setTitle("Dummy header");
                header.setAuthor("Chandra");
                header.setDate("Today");
                header.setDescription("This workout is the bomb diggity");
                Routine routine = new Routine(header, collection);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);
                list.add(routine);

//                list.add("Warm-up exercise");
//                list.add("Jogging exercise");
//                list.add("Yoga exercise");
//                list.add("Running exercise");
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