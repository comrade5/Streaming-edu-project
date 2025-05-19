import java.util.List;

public abstract class Operator {
    public String name;
    public Operator(String name) {
        this.name = name;
    }
    public void apply(Event event, List<Event> collector);
}