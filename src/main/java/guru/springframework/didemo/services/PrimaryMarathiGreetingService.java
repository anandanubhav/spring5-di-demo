package guru.springframework.didemo.services;

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
