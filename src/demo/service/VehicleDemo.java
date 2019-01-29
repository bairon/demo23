package demo.service;

import demo.model.Vehicle;

public abstract class VehicleDemo implements Demo {
    private final Vehicle vehicle;

    VehicleDemo(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void start() {
        vehicle.run();
    }
}
