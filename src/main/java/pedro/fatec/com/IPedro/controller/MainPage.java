package pedro.fatec.com.IPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {

    @GetMapping
    public String index(){
        return "index";
    }
}
