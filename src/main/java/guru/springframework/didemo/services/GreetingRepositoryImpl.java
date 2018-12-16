package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getHindiGreeting() {
        return "Namaste - I am Hindi Greeting";
    }

    @Override
    public String getMarathiGreeting() {
        return "Me Marathi Greeting Service Ahe!";
    }

}
