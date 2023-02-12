package app.injection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean {
    private Engine engine;

    public Car(Engine engine) {
        System.out.println("Car constructor init");
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }

    public void init(){
        System.out.println("Init method class Car");
    }

    @Override
    public void destroy(){
        System.out.println("Destroy method class Car");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method class Car");
    }
}
