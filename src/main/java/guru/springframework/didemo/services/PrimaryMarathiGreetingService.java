package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mi")
@Primary
public class PrimaryMarathiGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Me Marathi Greeting Service Ahe!";
    }
}
