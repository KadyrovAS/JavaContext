package app.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class People {
    private String name;
    private int age;

    public People(){}
//    public People(@Value("name") String name, @Value("age")String age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Good bue, World");
    }

    @PostConstruct
    public void init(){
        System.out.println("Hello, World");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
