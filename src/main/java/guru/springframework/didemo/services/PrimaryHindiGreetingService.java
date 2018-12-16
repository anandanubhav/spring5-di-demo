package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("hn")
@Primary
public class PrimaryHindiGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Namaste - I am Hindi Greeting";
    }
}
