package pedro.fatec.com.IPedro.domain.broadcastBin;

import pedro.fatec.com.IPedro.domain.id.Id;
import pedro.fatec.com.IPedro.domain.inMask.InMask;

public class BroadcastBin {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public BroadcastBin(Id id, InMask inMask) {
        Integer a = Integer.valueOf(id.getFirstOct());
        Integer b = Integer.valueOf(inMask.getFirstOct());
        String buffer = Integer.toBinaryString(b | a);
        FirstOct = String.format("%8s", buffer).replace(' ', '0');

        Integer a = Integer.valueOf(id.getFirstOct());
        Integer b = Integer.valueOf(inMask.getFirstOct());
        String buffer = Integer.toBinaryString(b | a);
        FirstOct = String.format("%8s", buffer).replace(' ', '0');

        Integer a = Integer.valueOf(id.getFirstOct());
        Integer b = Integer.valueOf(inMask.getFirstOct());
        String buffer = Integer.toBinaryString(b | a);
        FirstOct = String.format("%8s", buffer).replace(' ', '0');

        Integer a = Integer.valueOf(id.getFirstOct());
        Integer b = Integer.valueOf(inMask.getFirstOct());
        String buffer = Integer.toBinaryString(b | a);
        FirstOct = String.format("%8s", buffer).replace(' ', '0');
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
        return "BroadcastBin{" +
                "FirstOct='" + FirstOct + '\'' +
                ", SecondOct='" + SecondOct + '\'' +
                ", ThirdOct='" + ThirdOct + '\'' +
                ", FourOct='" + FourOct + '\'' +
                '}';
    }
}
