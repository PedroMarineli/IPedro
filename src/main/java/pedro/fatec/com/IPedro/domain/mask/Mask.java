package pedro.fatec.com.IPedro.domain.mask;

public class Mask {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public Mask(String cidr) {
        String buffer = "";

        for (int i = 0; i < Integer.parseInt(cidr); i++) {
            buffer = buffer.concat("1");
        }

        buffer = String.format("%32s", buffer).replace(' ', '0');

        StringBuilder builder = new StringBuilder(buffer);
        buffer = builder.reverse().toString();

        System.out.println(buffer);

        FirstOct = buffer.substring(0, 8);
        SecondOct = buffer.substring(8, 16);
        ThirdOct = buffer.substring(16, 24);
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
        return "Mask{" +
                "FirstOct='" + FirstOct + '\'' +
                ", SecondOct='" + SecondOct + '\'' +
                ", ThirdOct='" + ThirdOct + '\'' +
                ", FourOct='" + FourOct + '\'' +
                '}';
    }
}
