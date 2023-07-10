package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    //На основе класса Timer создайте бин. Свяжите с AnimalCage.
    // Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
//    @Bean(name = "Timer")
//    public Timer getTimer(){
//        return new Timer();
//    }
//
//    @Bean(name = "Dog")
////  @Scope("prototype")
//    public Dog getDog() {
//        return new Dog();
//    }
}
