package demo.service;

import demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("sportcarDemo")
public class SportcarDemo extends VehicleDemo {

    public SportcarDemo(@Qualifier("sportCar") Vehicle vehicle) {
        super(vehicle);
    }

}
