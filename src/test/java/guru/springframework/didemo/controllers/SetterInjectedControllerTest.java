package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setup() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS , setterInjectedController.sayHello());
    }
}
