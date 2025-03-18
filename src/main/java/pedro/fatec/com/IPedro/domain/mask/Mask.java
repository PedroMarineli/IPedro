package pedro.fatec.com.IPedro.domain.mask;

public class Mask {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public Mask(String cidr) {

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
        return "Mask{" +
                "FirstOct='" + FirstOct + '\'' +
                ", SecondOct='" + SecondOct + '\'' +
                ", ThirdOct='" + ThirdOct + '\'' +
                ", FourOct='" + FourOct + '\'' +
                '}';
    }
}
