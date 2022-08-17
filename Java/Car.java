public class Car {
    int id = 0;
    String license = "";
    String driver = "";
    int passenger = 0;

    public void printDataCar() {
        System.out.println("Car id: " + id +
                "\nCar license: " + license +
                "\nCar driver: " + driver +
                "\nCar passenger: " + passenger);
    }
}
