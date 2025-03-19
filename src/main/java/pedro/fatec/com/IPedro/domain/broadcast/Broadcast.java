package pedro.fatec.com.IPedro.domain.broadcast;

import pedro.fatec.com.IPedro.domain.broadcastBin.BroadcastBin;

public class Broadcast {
    private String FirstOct;
    private String SecondOct;
    private String ThirdOct;
    private String FourOct;

    public Broadcast(BroadcastBin broadcastBin) {
        FirstOct = String.valueOf(Integer.parseInt(broadcastBin.getFirstOct(), 2 ));
        SecondOct = String.valueOf(Integer.parseInt(broadcastBin.getSecondOct(), 2 ));
        ThirdOct = String.valueOf(Integer.parseInt(broadcastBin.getThirdOct(), 2 ));
        FourOct = String.valueOf(Integer.parseInt(broadcastBin.getFourOct(), 2 ));
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
        return "Broadcast{" +
                "FirstOct='" + FirstOct + '\'' +
                ", SecondOct='" + SecondOct + '\'' +
                ", ThirdOct='" + ThirdOct + '\'' +
                ", FourOct='" + FourOct + '\'' +
                '}';
    }
}
