package app.injection;

import app.injection.conflict.Bean01;
import app.injection.conflict.Bean02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Context init start");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("injectionContext.xml");
//        System.out.println(context.getBean(People.class));
        System.out.println("context started");
        Car car = context.getBean(Car.class);
        System.out.println(car);
        context.registerShutdownHook();
//        Bean01 b1 = context.getBean(Bean01.class);
//        Bean02 b2 = context.getBean(Bean02.class);
//
//        System.out.println(b1);
//        System.out.println(b2);
    }
}
