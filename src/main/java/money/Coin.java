package money;

public class Coin {
    private Pence value;


    public Coin(Pence value) {
        this.value = value;
    }

    public double getValue(){
        return value.getValue();
    }
    public String getDenomination(){
        return value.getDenomination();
    }
}
