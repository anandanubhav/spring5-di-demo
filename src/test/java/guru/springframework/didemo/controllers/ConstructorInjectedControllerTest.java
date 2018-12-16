package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setup() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS , constructorInjectedController.sayHello());
    }
}
