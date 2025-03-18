package pedro.fatec.com.IPedro.domain.ipBin;

public class IpBin {
    private Integer FirstOct;
    private Integer SecondOct;
    private Integer ThirdOct;
    private Integer FourOct;


    public IpBin(String binaryString, String binaryString1, String binaryString2, String binaryString3) {
        FirstOct = Integer.valueOf(binaryString);
        SecondOct = Integer.valueOf(binaryString1);
        ThirdOct = Integer.valueOf(binaryString2);
        FourOct = Integer.valueOf(binaryString3);
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

    @Override
    public String toString() {
        return "IpBin{" +
                "FirstOct=" + FirstOct +
                ", SecondOct=" + SecondOct +
                ", ThirdOct=" + ThirdOct +
                ", FourOct=" + FourOct +
                '}';
    }
}
