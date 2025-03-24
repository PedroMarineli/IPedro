package pedro.fatec.com.IPedro.domain.mask;

import pedro.fatec.com.IPedro.domain.maskBin.MaskBin;

public class Mask {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public Mask(MaskBin maskBin) {
        FirstOct = String.valueOf(Integer.parseInt(maskBin.getFirstOct(), 2 ));
        SecondOct = String.valueOf(Integer.parseInt(maskBin.getSecondOct(), 2 ));
        ThirdOct = String.valueOf(Integer.parseInt(maskBin.getThirdOct(), 2 ));
        FourOct = String.valueOf(Integer.parseInt(maskBin.getFourOct(), 2 ));
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
