package dio.my_first_web_api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController{
    @GetMapping
    public String welcome(){
        return "Welcome to my first spring boot api";
    }
}