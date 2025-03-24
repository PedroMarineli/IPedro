package pedro.fatec.com.IPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pedro.fatec.com.IPedro.domain.adress.Adress;
import pedro.fatec.com.IPedro.domain.broadcast.Broadcast;
import pedro.fatec.com.IPedro.domain.broadcastBin.BroadcastBin;
import pedro.fatec.com.IPedro.domain.cidr.Cidr;
import pedro.fatec.com.IPedro.domain.id.Id;
import pedro.fatec.com.IPedro.domain.idBin.IdBin;
import pedro.fatec.com.IPedro.domain.inMask.InMask;
import pedro.fatec.com.IPedro.domain.inMaskBin.InMaskBin;
import pedro.fatec.com.IPedro.domain.ip.Ip;
import pedro.fatec.com.IPedro.domain.ipBin.IpBin;
import pedro.fatec.com.IPedro.domain.mask.Mask;
import pedro.fatec.com.IPedro.domain.maskBin.MaskBin;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainPage {
    Adress adress = new Adress();

    @GetMapping
    public String index(){
        return "index";
    }

    @PostMapping("/save")
    @ResponseBody
    public Map<String, Object> saveIp(String ip, String cidr){

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

        MaskBin maskBin = new MaskBin(cidr);
        adress.setMaskBin(maskBin);

        Mask mask = new Mask(maskBin);
        adress.setMask(mask);

        InMaskBin inMaskBin = new InMaskBin(mask);
        adress.setInMaskBin(inMaskBin);

        InMask inMask = new InMask(inMaskBin);
        adress.setInMask(inMask);

        IdBin idBin = new IdBin(mask, ipNew);
        adress.setIdBin(idBin);

        Id id = new Id(idBin);
        adress.setId(id);

        BroadcastBin broadcastBin = new BroadcastBin(id, inMask);
        adress.setBroadcastBin(broadcastBin);

        Broadcast broadcast = new Broadcast(broadcastBin);
        adress.setBroadcast(broadcast);

        Map<String, Object> response = new HashMap<>();
        response.put("ip", ipNew.toString());
        response.put("cidr", cidrNew.toString());
        response.put("ipBin", ipBin.toString());
        response.put("maskBin", maskBin.toString());
        response.put("mask", mask.toString());
        response.put("inMaskBin", inMaskBin.toString());
        response.put("inMask", inMask.toString());
        response.put("idBin", idBin.toString());
        response.put("id", id.toString());
        response.put("broadcastBin", broadcastBin.toString());
        response.put("broadcast", broadcast.toString());

        return response;
    }

}
