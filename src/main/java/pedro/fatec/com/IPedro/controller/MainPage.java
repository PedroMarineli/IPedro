package pedro.fatec.com.IPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pedro.fatec.com.IPedro.domain.adress.Adress;
import pedro.fatec.com.IPedro.domain.cidr.Cidr;
import pedro.fatec.com.IPedro.domain.ip.Ip;

@Controller
public class MainPage {
    Adress adress = new Adress();

    @GetMapping
    public String index(Model model){
        model.addAttribute("adress", adress);
        return "index";
    }

    @PostMapping
    public String saveIp(String ip, String cidr){
        ip = ip.replace(".", "");
        Integer ipFirst = Integer.valueOf(ip.substring(0, 3));
        Integer ipSecond = Integer.valueOf(ip.substring(3, 6));
        Integer ipThird = Integer.valueOf(ip.substring(6, 9));
        Integer ipFour = Integer.valueOf(ip.substring(9, 12));
        Ip ipNew = new Ip(ipFirst, ipSecond, ipThird, ipFour);
        adress.setIp(ipNew);
        Cidr cidrNew = new Cidr(cidr);
        adress.setCidr(cidrNew);

        return "redirect:";
    }




}
