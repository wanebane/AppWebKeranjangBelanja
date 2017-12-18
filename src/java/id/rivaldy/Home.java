package id.rivaldy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/home")
public class Home {

    @RequestMapping()
    public String goHome(Model model) {
        model.addAttribute("mHome", "This is home page");
        model.addAttribute("tHome", "Home");
        return "home";
    }
}
