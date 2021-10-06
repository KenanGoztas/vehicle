import java.nio.charset.StandardCharsets;

public class Vw extends Car{
    private String fuel;
    private String model;

    public Vw(String make, String color, int year, int door, String body, String fuel, String model) {
        super(make, color, year, door, body);
        this.fuel =fuel;
        this.model = model;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("fuel  = " + fuel);
        System.out.println("model = " + model);
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }
}
