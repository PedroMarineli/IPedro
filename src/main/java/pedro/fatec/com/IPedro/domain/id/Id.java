package pedro.fatec.com.IPedro.domain.id;

import pedro.fatec.com.IPedro.domain.idBin.IdBin;

public class Id {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public Id(IdBin idBin) {
        FirstOct = String.valueOf(Integer.parseInt(idBin.getFirstOct(), 2 ));
        SecondOct = String.valueOf(Integer.parseInt(idBin.getSecondOct(), 2 ));
        ThirdOct = String.valueOf(Integer.parseInt(idBin.getThirdOct(), 2 ));
        FourOct = String.valueOf(Integer.parseInt(idBin.getFourOct(), 2 ));
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
        return "Id: " + FirstOct + "." + SecondOct + "." + ThirdOct + "." + FourOct;
    }
}
