package pedro.fatec.com.IPedro.domain.ip;

public class Ip {
    private Integer FirstOct;
    private Integer SecondOct;
    private Integer ThirdOct;
    private Integer FourOct;

    public Ip(Integer firstOct, Integer secondOct, Integer thirdOct, Integer fourOct) {
        FirstOct = firstOct;
        SecondOct = secondOct;
        ThirdOct = thirdOct;
        FourOct = fourOct;
    }

    @Override
    public String toString() {
        return FirstOct + "." + SecondOct + "." + ThirdOct + "." + FourOct;
    }

    public Integer getFirstOct() {
        return FirstOct;
    }

    public void setFirstOct(Integer firstOct) {
        FirstOct = firstOct;
    }

    public Integer getSecondOct() {
        return SecondOct;
    }

    public void setSecondOct(Integer secondOct) {
        SecondOct = secondOct;
    }

    public Integer getThirdOct() {
        return ThirdOct;
    }

    public void setThirdOct(Integer thirdOct) {
        ThirdOct = thirdOct;
    }

    public Integer getFourOct() {
        return FourOct;
    }

    public void setFourOct(Integer fourOct) {
        FourOct = fourOct;
    }
}
