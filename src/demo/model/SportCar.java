package demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sportCar")
public class SportCar implements Vehicle {
    @Override
    public void run() {
        System.out.println("Sport Car is running!");
    }
}
