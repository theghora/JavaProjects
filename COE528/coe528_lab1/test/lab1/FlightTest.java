/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tahag
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructor(){
        double x =5;
        Flight r = new Flight(0, "1", "2", "3", 4, 5);
            assertEquals(r.getFlightNumber(), 0);
            assertEquals(r.getOrigin(), "1");
            assertEquals(r.getDestination(), "2");
            assertEquals(r.getDepartureTime(),"3");
            assertEquals(r.getCapacity(), 4);
            assertEquals(r.getOriginalPrice(),x,5.0);
            
    }
    @Test
    public void testInvalidConstructor(){
        try{
            Flight r = new Flight(0, "1", "1", "3", 4, 5);
            assertTrue(false);
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        int expResult = 0;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 5;
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setFlightNumber(flightNumber);
        assertEquals(flightNumber, instance.getFlightNumber());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        String expResult = "1";
        String result =instance.getOrigin();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "6";
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setOrigin(origin);
        assertEquals(origin,instance.getOrigin());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        String expResult = "2";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "6";
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setDestination(destination);
        assertEquals("6", instance.getDestination());
        
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        String expResult = "3";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "6";
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setDepartureTime(departureTime);
        assertEquals(instance.getDepartureTime(), "6");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        int expResult = 4;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 6;
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setCapacity(capacity);
        assertEquals(capacity, instance.getCapacity());
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        int expResult = 4;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 6;
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(numberOfSeatsLeft, instance.getNumberOfSeatsLeft());
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        double expResult = 5.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 5.0);
        
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 6.1;
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        instance.setOriginalPrice(originalPrice);
        assertEquals(instance.getOriginalPrice(), originalPrice,6.1);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        Flight instance = new Flight(0, "1", "2", "3", 4, 5);
        String expResult = "Flight 0, 1 to 2, 3, Original Price: $5.00";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
