import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTests {
    @Test
    public void myFirstTest(){
        System.out.println("Inside our first test.");
    }

    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "CodeUp";
        String actual = "CodeUp";

        assertEquals(expected, actual);
        assertNotEquals("Douglas", actual);
    }
    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();

        Object cleanedSheep = sheep;

        assertNotSame(dog, sheep);
        assertSame(sheep, cleanedSheep);


//        String instructorOne = new String("Douglas");
//        //Object instructorTwo = new String("Douglas");
//        String instructor2 = instructorOne;
//
//        assertEquals(instructorOne, instructorTwo);
//        assertSame(instructorOne, instructorTwo);
    }

    @Test
    public void testIfArrayEquals(){
        char[] expected = {'J','u','n','i','t'};
        System.out.println("expected = " + expected);
        char[] actual = "Junit".toCharArray();
        System.out.println("actual = "+ actual);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void testIfGreaterOrLesserthanWorks(){
        boolean leanringTDD = true;

        assertTrue(leanringTDD);
        assertTrue("5 is greater than 4", 5 > 4 );
        assertFalse("5 is not greater than 6", 5>6);

    }

    @Test
    public void testIfInstanceIsNull(){
        Object phone = new Object();
        Object laptop = null;

        assertNotNull(phone);
        assertNull(laptop);
    }

    @Test
    public void testifdevicehasname(){
        Device phone = new Device("iPhone");

        assertEquals("iPhone", phone.getName());
    }

    private List<String> names;

    @Before
    public void setUp(){
        System.out.println("Running Setup");
        this.names = new ArrayList<>();
        this.names.add("Kenneth");
    }

    @Test
    public void testIfnamesIsInitialized(){
        assertNotNull(this.names);
        this.names.add("Douglas");
    }

    @Test
    public void testifnameshascorrectnumberofnames(){
        assertEquals(1,this.names.size());
    }


    //instances


    //constructors


    //main


    // do NOT create a main method when testing
//    public static void main(String[] args){
//
//    }
}
