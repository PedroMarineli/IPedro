package pedro.fatec.com.IPedro.domain.ipBin;

public class IpBin {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;


    public IpBin(String binaryString, String binaryString1, String binaryString2, String binaryString3) {
        FirstOct = String.format("%8s", binaryString).replace(' ', '0');
        SecondOct = String.format("%8s", binaryString1).replace(' ', '0');
        ThirdOct = String.format("%8s", binaryString2).replace(' ', '0');
        FourOct = String.format("%8s", binaryString3).replace(' ', '0');
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
        return "IpBin: " + FirstOct + "." + SecondOct + "." + ThirdOct + "." + FourOct;
    }
}
