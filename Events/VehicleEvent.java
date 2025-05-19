public class VehicleEven extends Event {
    private final String vehicle;

    public VehicleEven(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getData() {
        return vehicle;
    }
}