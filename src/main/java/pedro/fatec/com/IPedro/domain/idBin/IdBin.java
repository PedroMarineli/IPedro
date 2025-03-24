package pedro.fatec.com.IPedro.domain.idBin;

import pedro.fatec.com.IPedro.domain.ip.Ip;
import pedro.fatec.com.IPedro.domain.ipBin.IpBin;
import pedro.fatec.com.IPedro.domain.mask.Mask;
import pedro.fatec.com.IPedro.domain.maskBin.MaskBin;

public class IdBin {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public IdBin(Mask mask, Ip ip) {
        Integer a = Integer.valueOf(mask.getFirstOct());
        String buffer = Integer.toBinaryString(ip.getFirstOct() & a);
        FirstOct = String.format("%8s", buffer).replace(' ', '0');

        a = Integer.valueOf(mask.getSecondOct());
        buffer = Integer.toBinaryString(ip.getSecondOct() & a);
        SecondOct = String.format("%8s", buffer).replace(' ', '0');

        a = Integer.valueOf(mask.getThirdOct());
        buffer = Integer.toBinaryString(ip.getThirdOct() & a);
        ThirdOct = String.format("%8s", buffer).replace(' ', '0');

        a = Integer.valueOf(mask.getFourOct());
        buffer = Integer.toBinaryString(ip.getFourOct() & a);
        FourOct = String.format("%8s", buffer).replace(' ', '0');
    }

    public String getFirstOct() {
        return FirstOct;
    }

    public void setFirstOct(String firstOct) {
        FirstOct = firstOct;
    }

    public String getSecondOct() {
        return SecondOct;
    }

    public void setSecondOct(String secondOct) {
        SecondOct = secondOct;
    }

    public String getThirdOct() {
        return ThirdOct;
    }

    public void setThirdOct(String thirdOct) {
        ThirdOct = thirdOct;
    }

    public String getFourOct() {
        return FourOct;
    }

    public void setFourOct(String fourOct) {
        FourOct = fourOct;
    }

    @Override
    public String toString() {
        return FirstOct + "." + SecondOct + "." + ThirdOct + "." + FourOct;
    }
}
