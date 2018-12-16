package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mi")
@Primary
public class PrimaryMarathiGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryMarathiGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getMarathiGreeting();
    }
}
