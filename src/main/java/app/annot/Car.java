package app.annot;

import javax.annotation.Resource;

public class Car {
    @Resource(name = "lightEngine")
    private Engine engine;

    public Car() {    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
