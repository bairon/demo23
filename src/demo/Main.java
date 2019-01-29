package demo;

import demo.service.Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo");

        Demo tractorDemo = context.getBean("tractorDemo", Demo.class);
        tractorDemo.start();

        Demo sportcarDemo = context.getBean("sportcarDemo", Demo.class);
        sportcarDemo.start();

    }


}
