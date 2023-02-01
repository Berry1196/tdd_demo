package Facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testHello() {
        System.out.println("Method to say hello");

        String actual = hello.sayHello(new String[] {"Helge"});
        String expected = "Hello Helge";
        assertEquals(expected,actual);
    }

    @Test
    public void testHelloNull() {
        System.out.println("Method to handle null name");

        String actual = hello.sayHello(null);
        String expected = "Hello my friend";
        assertEquals(expected,actual);
    }
    @Test
    public void testALLCAPS() {
        System.out.println("Method to handle ALL CAPS name");

        String actual = hello.sayHello(new String[] {"HELGE"});
        String expected = "HELLO HELGE";
        assertEquals(expected,actual);
    }
    @Test
    public void testTwoNamesInput() {
        System.out.println("Method to handle two names");

        String actual = hello.sayHello(new String[] {"Helge", "Martin"});
        String expected = "Hello Helge and Martin";
        assertEquals(expected,actual);
    }


}
