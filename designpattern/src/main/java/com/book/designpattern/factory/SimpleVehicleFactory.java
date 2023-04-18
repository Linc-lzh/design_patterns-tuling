package com.book.designpattern.factory;

import com.book.designpattern.factory.mode.Bike;
import com.book.designpattern.factory.mode.Car;
import com.book.designpattern.factory.mode.Truck;
import com.book.designpattern.factory.mode.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class SimpleVehicleFactory {
    private Map<String, Class> registeredProducts = new HashMap<>();
    public enum VehicleType{
        Bike, Car, Truck;
    }

    public void registerVehicle(String vehicleId, Class vehicleClass){
        registeredProducts.put(vehicleId, vehicleClass);
    }

    public static Vehicle create(VehicleType type){
        if(type.equals(VehicleType.Bike))
            return new Bike();
        if(type.equals(VehicleType.Car))
            return new Car();
        if(type.equals(VehicleType.Truck))
            return new Truck();
        else
            return null;
    }
}
