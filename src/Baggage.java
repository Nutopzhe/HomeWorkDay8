public class Baggage {
    private String carrier;
    private String flight;
    private int weight;

    public Baggage(String carrier, String flight, int weight) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Перевозчик: [%s] - Класс: [%s] - Багаж: [%dкг]\n",
                carrier, flight, weight);
    }
}
