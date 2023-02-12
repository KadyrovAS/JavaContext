package app.injection.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("before context ctarted");
        ApplicationContext context = new ClassPathXmlApplicationContext("lazyContext.xml");
        System.out.println("after context ctart");

        context.getBean(People.class);
    }
}
