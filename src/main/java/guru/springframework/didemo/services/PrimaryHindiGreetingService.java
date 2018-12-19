package guru.springframework.didemo.services;

public class PrimaryHindiGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryHindiGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getHindiGreeting();
    }
}
