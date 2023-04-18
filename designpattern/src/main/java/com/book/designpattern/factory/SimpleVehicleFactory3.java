package com.book.designpattern.factory;

import com.book.designpattern.factory.mode.Bike;
import com.book.designpattern.factory.mode.Car;
import com.book.designpattern.factory.mode.Truck;
import com.book.designpattern.factory.mode.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class SimpleVehicleFactory3 {
    private Map<String, Vehicle> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Vehicle vehicle){
        registeredProducts.put(vehicleId, vehicle);
    }

    // low effective
    public Vehicle createVehicle(String vehicleId) {
        return registeredProducts.get(vehicleId).newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SimpleVehicleFactory3 simpleVehicleFactory = new SimpleVehicleFactory3();
        simpleVehicleFactory.registerVehicle("Truck", new Truck());
        simpleVehicleFactory.registerVehicle("Car", new Car());
        simpleVehicleFactory.registerVehicle("Bike", new Bike());

        Vehicle truck = simpleVehicleFactory.createVehicle("Truck");
        System.out.println(truck);
    }
}
