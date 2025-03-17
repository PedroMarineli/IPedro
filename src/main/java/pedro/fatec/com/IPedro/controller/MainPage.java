package pedro.fatec.com.IPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pedro.fatec.com.IPedro.domain.adress.Adress;

@Controller
public class MainPage {
    Adress adress = new Adress();

    @GetMapping
    public String index(Model model){
        model.addAttribute("adress", adress);
        return "index";
    }
}
