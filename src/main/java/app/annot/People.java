package app.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
