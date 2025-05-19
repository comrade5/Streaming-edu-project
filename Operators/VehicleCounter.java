import java.util.List;

public class VehicleCounter extends Operator {
    private final Map<String, Integer> countMap = new HashMap<String, Integer>();

    public VehicleCounter(String name) {
        super(name);
    }

    public void printCountMap() {
        if (countMap.isEmpty()) {
            System.out.println("Count map is empty.");
        } else {
            System.out.println("Count Map Contents:");
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public void apply(Event event, List<Event> collector) {
        String vehicle = event.getData();
        Integer count = countMap.getOrDefault(vehicle, 0);
        count += 1;
        countMap.put(vehicle, count);
        System.out.println("VehicleCounter --> ");
        printCountMap();
    }
}