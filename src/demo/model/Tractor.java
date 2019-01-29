package demo.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tractor")
public class Tractor implements Vehicle {

    @Override
    public void run() {
        System.out.println("Tractor is running!");
    }

}
