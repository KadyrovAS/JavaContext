package app.withoutAnnot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("production");
        context.register(Config.class);
        context.refresh();
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }
}
