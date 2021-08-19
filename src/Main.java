import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Baggage> baggageList = new ArrayList<>();

        baggageList.add(new Baggage("Аэрофлот", "Эконом", 5));
        baggageList.add(new Baggage("Аэрофлот", "Комфорт", 15));
        baggageList.add(new Baggage("Аэрофлот", "Бизнес", 25));
        baggageList.add(new Baggage("Red Wings", "Эконом", 7));
        baggageList.add(new Baggage("S7", "Первый", 20));

        baggageList.sort(new Comparator<Baggage>() {
            @Override
            public int compare(Baggage o1, Baggage o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        System.out.println(baggageList);
    }
}
