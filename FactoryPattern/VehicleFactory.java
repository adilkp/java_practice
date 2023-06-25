package FactoryPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String str) {
        if(str.equalsIgnoreCase("car")) {
            return new Car();
        }
        else  if(str.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        else return new Truck();
    }
}
