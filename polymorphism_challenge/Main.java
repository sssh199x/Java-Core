package polymorphism_challenge;

public class Main {

    public static void main(String args[]){

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 396 GTS", 10.5, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model S", 100, 85);
        runRace(tesla);

        Car  ford = new HybridCar("2022 White Ford Escape Hybrid", 15.5, 14, 4);
        runRace(ford);


    }

    public static void runRace(Car car ){
        car.startEngine();
        car.drive();
    }
}
