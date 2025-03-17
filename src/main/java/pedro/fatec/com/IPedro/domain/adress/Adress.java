package pedro.fatec.com.IPedro.domain.adress;

import pedro.fatec.com.IPedro.domain.broadcast.Broadcast;
import pedro.fatec.com.IPedro.domain.broadcastBin.BroadcastBin;
import pedro.fatec.com.IPedro.domain.cidr.Cidr;
import pedro.fatec.com.IPedro.domain.id.Id;
import pedro.fatec.com.IPedro.domain.idBin.IdBin;
import pedro.fatec.com.IPedro.domain.inMaskBin.InMaskBin;
import pedro.fatec.com.IPedro.domain.ip.Ip;
import pedro.fatec.com.IPedro.domain.ipBin.IpBin;
import pedro.fatec.com.IPedro.domain.ipClass.IpClass;
import pedro.fatec.com.IPedro.domain.mask.Mask;
import pedro.fatec.com.IPedro.domain.maskBin.MaskBin;

public class Adress {
    private Ip ip;
    private IpBin ipBin;
    private Mask mask;
    private MaskBin maskBin;
    private InMaskBin inMaskbin;
    private Id id;
    private IdBin idBin;
    private IpClass Ipclass;
    private Broadcast broadcast;
    private BroadcastBin broadcastBin;
    private Cidr cidr;
}
