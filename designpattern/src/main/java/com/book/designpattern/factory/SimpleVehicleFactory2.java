package com.book.designpattern.factory;

import com.book.designpattern.factory.mode.Bike;
import com.book.designpattern.factory.mode.Car;
import com.book.designpattern.factory.mode.Truck;
import com.book.designpattern.factory.mode.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class SimpleVehicleFactory2 {
    private Map<String, Class> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Class vehicleClass){
        registeredProducts.put(vehicleId, vehicleClass);
    }

    // low effective
    public Vehicle createVehicle(String type) throws InstantiationException, IllegalAccessException {
        Class productClass = registeredProducts.get(type);
        return (Vehicle) productClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SimpleVehicleFactory2 simpleVehicleFactory = new SimpleVehicleFactory2();
        simpleVehicleFactory.registerVehicle("Truck", Truck.class);
        simpleVehicleFactory.registerVehicle("Car", Car.class);
        simpleVehicleFactory.registerVehicle("Bike", Bike.class);

        Vehicle truck = simpleVehicleFactory.createVehicle("Truck");
        System.out.println(truck);
    }
}
