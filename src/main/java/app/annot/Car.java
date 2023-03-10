package app.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
//@Scope("prototype")
@Scope("singleton")
public class Car {
//    @Resource(name = "lightEngine")
    @Autowired
//    @Qualifier("lightEngine")
    @TypeEngine("lightEngine")
    private Engine engine;

    public Car() {
        System.out.println("Контруктор класса Car");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
