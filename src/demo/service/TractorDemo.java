package demo.service;

import demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("tractorDemo")
public class TractorDemo extends VehicleDemo {

    @Autowired
    public TractorDemo(@Qualifier("tractor") Vehicle vehicle) {
        super(vehicle);
    }

}
