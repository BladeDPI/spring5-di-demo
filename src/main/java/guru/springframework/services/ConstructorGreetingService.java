package guru.springframework.services;

import org.springframework.stereotype.Repository;

/**
 * Created by jt on 5/24/17.
 */
@Repository
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
