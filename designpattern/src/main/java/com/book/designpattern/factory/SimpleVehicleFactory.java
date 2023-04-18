package com.book.designpattern.factory;

import com.book.designpattern.factory.mode.*;

public class SimpleVehicleFactory {

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

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();

        Vehicle truck = simpleVehicleFactory.create(VehicleType.Truck);
        System.out.println(truck);
    }
}
