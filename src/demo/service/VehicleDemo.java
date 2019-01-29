package demo.service;

import demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("vehicleDemo")
public class VehicleDemo implements Demo {

    final Vehicle vehicle;

    @Autowired()
    public VehicleDemo(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        vehicle.run();
    }

}
