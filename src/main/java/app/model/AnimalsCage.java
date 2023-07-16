package app.model;

import app.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage  {
//свяжите AnimalCage c бином Dog через абстрактный класс Animal.

    @Autowired
    @Qualifier("Dog")
    private Animal animal;

    @Autowired

    private Timer timer;

    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
