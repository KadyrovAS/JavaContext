package app.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Car {
//    @Resource(name = "lightEngine")
    @Autowired
    @Qualifier("lightEngine")
    private Engine engine;

    public Car() {    }

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
