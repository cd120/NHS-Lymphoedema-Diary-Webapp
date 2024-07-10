package nhs.uhdb.NHS_project.home_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")

    public ModelAndView getHomePage(){
        return new ModelAndView("index");
    }
}
