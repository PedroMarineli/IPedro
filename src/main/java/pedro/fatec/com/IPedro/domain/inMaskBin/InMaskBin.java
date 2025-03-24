package pedro.fatec.com.IPedro.domain.inMaskBin;

import pedro.fatec.com.IPedro.domain.mask.Mask;
import pedro.fatec.com.IPedro.domain.maskBin.MaskBin;

public class InMaskBin {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public InMaskBin(Mask mask) {
        Integer a = Integer.valueOf(mask.getFirstOct());
        String buffer = Integer.toBinaryString(~a);
        FirstOct = buffer.substring(24, 32);

        a = Integer.valueOf(mask.getSecondOct());
        buffer = Integer.toBinaryString(~a);
        SecondOct = buffer.substring(24, 32);

        a = Integer.valueOf(mask.getThirdOct());
        buffer = Integer.toBinaryString(~a);
        ThirdOct = buffer.substring(24, 32);

        a = Integer.valueOf(mask.getFourOct());
        buffer = Integer.toBinaryString(~a);
        FourOct = buffer.substring(24, 32);
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
