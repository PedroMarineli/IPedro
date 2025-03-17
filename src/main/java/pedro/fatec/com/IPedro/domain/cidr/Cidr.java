package pedro.fatec.com.IPedro.domain.cidr;

public class Cidr {
    private Integer value;

    public Cidr(String cidr) {
        value = Integer.valueOf(cidr);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cidr{" +
                "value=" + value +
                '}';
    }
}
