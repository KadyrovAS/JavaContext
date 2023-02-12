package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Работает с зависимостью версии 5.2.8.RELEASE
//<dependency>
//<groupId>org.springframework</groupId>
//<artifactId>spring-context</artifactId>
//<version>5.2.8.RELEASE</version>
//</dependency>

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Calculator calculator = context.getBean(Calculator.class);
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator);

        ((ConfigurableApplicationContext) context).registerShutdownHook();
    }
}