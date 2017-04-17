package spring.controllers.Routine;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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