package app.withoutAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

        //xml-файлы все можно было удалить
        //Они не работают в этой конфигурации

@Component
public class Car {
    @Autowired
    @Qualifier("lightEngine")
    private Engine engine;

    @Autowired
    Environment env;

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
                '}' + " " + env.getProperty("name");
            }
}
