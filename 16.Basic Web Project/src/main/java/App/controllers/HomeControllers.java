package App.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeControllers {
    @GetMapping ("/hello")
    public ModelAndView hello(ModelAndView modelAndView){
        modelAndView.setViewName("hello.html");
        List<String> names= Arrays.asList("Pesho","Gosho","Tosho");
        modelAndView.addObject("name",names);
        return modelAndView;
    }
}
