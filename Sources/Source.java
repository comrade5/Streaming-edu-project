import java.util.List;

public abstract class Source {
    public String name;

    public Source(String name) {
        this.name = name;
    }

    public void setupSocketReader(int port) {
        System.out.println('Source ' + this.name + ' listening on port: ' + port);
    }

    public abstract void getEvents(List<Event> eventCollector);
}