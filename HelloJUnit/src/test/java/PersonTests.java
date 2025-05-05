//This will contain a very simple test suite for JUnit
//(one of the fundamental Java testing frameworks).
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {

    //Uninitialized Person object
    private static Person person;

    //BeforeAll - This method will run once, and only once, before any tests run
    @BeforeAll
    public static void beforeAll(){
        //Not much to do in this test suite, but we can instantiate the Person object here
        //Now we don't have to do it in every test!
        person = new Person();
    }

    //BeforeEach - This method will run before each test
    @BeforeEach
    public void beforeEach(){
        System.out.println("That test was great! Here's another one:");
    }

    //Yes, we could have shown AfterAll and AfterEach, but I'm out of ideas.
    //If we had some expensive resource to close, like a DB connection, that's one use case

    @Test
    public void testWalk(){

        //Invoke the walk() method, save its return so we can test it
        String result = person.walk();

        //Use assert methods to test that the result is what we expect
        assertEquals("Person is walking", result);

        //NOTE: walk() can literally only return one thing,
        //which is the string "Person is walking"

        //But tests become way more important when there are multiple possible outcomes

    }



}
