package app.withoutAnnot;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "app.withoutAnnot")
@PropertySource("application.properties")
@Profile("production")
/**
 * Конфигурационный файл
 */
public class Config { //У класса конфигурации может быть любое имя.

    /**
     * Определяем bean
     * @return класс бина
     */
    @Bean(value = "heaveEngine", initMethod = "init")
//    @Primary
    public Engine getEngine(){
        return new HeavyEngine();
    }

    @Bean("lightEngine")
    public Engine getLightEngine(){
        return new LightEngine();
    }

//    @Bean
//    public Car getCar(){
//        return new Car();
//    }
}
