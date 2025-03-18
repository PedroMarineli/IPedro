package pedro.fatec.com.IPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pedro.fatec.com.IPedro.domain.adress.Adress;
import pedro.fatec.com.IPedro.domain.cidr.Cidr;
import pedro.fatec.com.IPedro.domain.ip.Ip;
import pedro.fatec.com.IPedro.domain.ipBin.IpBin;

import java.util.Arrays;

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

        String [] octs = ip.split("\\.");

        int ipFirst = Integer.parseInt(octs[0]);
        int ipSecond = Integer.parseInt(octs[1]);
        int ipThird = Integer.parseInt(octs[2]);
        int ipFour = Integer.parseInt(octs[3]);

        Ip ipNew = new Ip(ipFirst, ipSecond, ipThird, ipFour);
        adress.setIp(ipNew);

        Cidr cidrNew = new Cidr(cidr);
        adress.setCidr(cidrNew);

        IpBin ipBin = new IpBin(Integer.toBinaryString(ipFirst), Integer.toBinaryString(ipSecond), Integer.toBinaryString(ipThird), Integer.toBinaryString(ipFour));
        adress.setIpBin(ipBin);

        return "redirect:";
    }




}
