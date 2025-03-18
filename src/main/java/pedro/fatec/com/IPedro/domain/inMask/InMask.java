package pedro.fatec.com.IPedro.domain.inMask;

import pedro.fatec.com.IPedro.domain.inMaskBin.InMaskBin;

public class InMask {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public InMask(InMaskBin inMaskBin) {
        FirstOct = String.valueOf(Integer.parseInt(inMaskBin.getFirstOct(), 2 ));
        SecondOct = String.valueOf(Integer.parseInt(inMaskBin.getSecondOct(), 2 ));
        ThirdOct = String.valueOf(Integer.parseInt(inMaskBin.getThirdOct(), 2 ));
        FourOct = String.valueOf(Integer.parseInt(inMaskBin.getFourOct(), 2 ));
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
        return "InMask{" +
                "FirstOct='" + FirstOct + '\'' +
                ", SecondOct='" + SecondOct + '\'' +
                ", ThirdOct='" + ThirdOct + '\'' +
                ", FourOct='" + FourOct + '\'' +
                '}';
    }
}
