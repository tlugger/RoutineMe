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
        System.out.println("login loading...");
        model.addAttribute("msg", "Enter your email address to sign in or create an account on RoutineMe");
        return "login";
    }



    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean login) {
        if (login != null && login.getEmail() != null & login.getPassword() != null) {
            if (login.getEmail().equals("chandra") && login.getPassword().equals("chandra123")) {
                model.addAttribute("msg", "welcome" + login.getEmail());

                System.out.println("l o g i n ");
                return "redirect:/routineFeed";
            } else {
                model.addAttribute("error", "Wrong Username or Password");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}