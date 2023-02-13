package app.annot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("annotationPeopleContext.xml");
//        People people = context.getBean(People.class);
//        System.out.println(people);

        Car car = context.getBean(Car.class);
        Car car1 = context.getBean(Car.class);
        System.out.println(car);
        context.registerShutdownHook();
    }
}
