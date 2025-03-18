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

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public IpBin getIpBin() {
        return ipBin;
    }

    public void setIpBin(IpBin ipBin) {
        this.ipBin = ipBin;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public MaskBin getMaskBin() {
        return maskBin;
    }

    public void setMaskBin(MaskBin maskBin) {
        this.maskBin = maskBin;
    }

    public InMaskBin getInMaskbin() {
        return inMaskbin;
    }

    public void setInMaskbin(InMaskBin inMaskbin) {
        this.inMaskbin = inMaskbin;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public IdBin getIdBin() {
        return idBin;
    }

    public void setIdBin(IdBin idBin) {
        this.idBin = idBin;
    }

    public IpClass getIpclass() {
        return Ipclass;
    }

    public void setIpclass(IpClass ipclass) {
        Ipclass = ipclass;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public BroadcastBin getBroadcastBin() {
        return broadcastBin;
    }

    public void setBroadcastBin(BroadcastBin broadcastBin) {
        this.broadcastBin = broadcastBin;
    }

    public Cidr getCidr() {
        return cidr;
    }

    public void setCidr(Cidr cidr) {
        this.cidr = cidr;
    }
}
