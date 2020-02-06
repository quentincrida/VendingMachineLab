public enum Pence {
    ONEPENCE(0.01,"1p"),
    TWOPENCE(0.02, "2p"),
    FIVEPENCE(0.05,"5p"),
    TENPENCE(0.1, "10p"),
    TWENTYPENCE(0.2, "20p"),
    FIFTYPENCE(0.5, "50p"),
    ONEPOUND(1.0, "£1"),
    TWOPOUNDS(2.0, "£2");

    private double value;
    private String denomination;

    Pence(double value, String denomination) {
        this.value = value;
        this.denomination = denomination;
    }

    public double getValue() {
        return value;
    }

    public String getDenomination() {
        return denomination;
    }
}
