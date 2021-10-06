public class Main {
    public static void start (Vehicle arac){
      arac.printDetails();
    }

    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Audi group", "blau", 2020 );
        vehicle.printDetails();
        System.out.println("±±±±±±");

        Car car = new Car("daimler", "white", 2021, 4, "sedan");
        car.printDetails();
        System.out.println(".......");

        Vw vosvos = new Vw("vw group" , "black", 2010, 5, "compact", "benzin" , "Touran");
        vosvos.printDetails();
        System.out.println(vosvos.toString());
        System.out.println("**********");

        Vehicle arac;
        arac = vosvos;
        arac.printDetails();
        System.out.println("** ** ** *");

        start(vosvos);








    }

}
