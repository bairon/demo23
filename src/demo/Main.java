package demo;

import demo.service.Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo");
        Demo demo = (Demo) context.getBean("vehicleDemo");
        demo.start();

    }


}
