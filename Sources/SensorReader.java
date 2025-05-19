import java.util.List;
import java.io.BufferedReader;

public class SensorReader extends Source {
    private final BufferedReader reader;

    public SensorReader(String name, int port) {
        super(name);
        this.reader = setupSocketReader(port);
    }

    @Override
    public void getEvents(List<Event> eventCollector) {
        String vehicle = reader.readLine();
        eventCollector.add(new VehicleEvent(vehicle));
        System.out.println("SensorReader --> " + vehicle);
    }
}