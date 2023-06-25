package FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {

        //Here client knows which class you are using..ie you have exposed your class to client
        Vehicle c = new Car();
        c.show();

        Vehicle b = new Bike();
        b.show();

        // Now we will not expose our class
        // VehicleFactory is the class which gives us object
        VehicleFactory v = new VehicleFactory();
        Vehicle obj = v.getVehicle("car");
        obj.show();
    }
}
