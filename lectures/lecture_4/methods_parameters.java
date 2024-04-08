public class Car {
    String model;
    int year;
    String color;
    public Car(String carModel, int carYear, String carColor) {
        model = carModel;
        year = carYear;
        color = carColor;
    }
    // We can customize all methods to accept parameters.
    // The method startRadio accepts the station number and the station name
    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("You are listening to the " + stationName + ", enjoy!");
    }
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "2000", "Red");
        ferrari.startRadio(103.7, "Los Santos Radio");
    }
}