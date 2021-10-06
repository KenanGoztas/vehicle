public class Car extends Vehicle {
    private int door;
    private String body;

    public Car(String make, String color, int year, int door, String body) {
        super(make, color, year);
        this.door = door;
        this.body= body;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getModel() {
        return body;
    }

    public void setModel(String model) {
        this.body = model;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("door = " +door);
        System.out.println("model = " + body);
    }
}
