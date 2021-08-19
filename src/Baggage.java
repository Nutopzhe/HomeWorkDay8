public class Baggage {
    private String carrier;
    private String flight;
    private double weight;

    public Baggage(String carrier, String flight, double weight) {
        this.carrier = carrier;
        this.flight = flight;
        this.weight = weight;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
