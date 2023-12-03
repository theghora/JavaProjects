/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tahag
 */
public class Flight {
    private int flightNumber;
    private String origin="";
    private String destination="";
    private String departureTime ="";
    private int capacity;
    private int numberOfSeatsLeft=0;
    private double originalPrice;
    
    public Flight(int flightnum, String ori, String dest, String deptime, int cap, double price){
        
        flightNumber=flightnum;
        departureTime=deptime;
        capacity=cap;
        numberOfSeatsLeft=cap;
        originalPrice = price;
        if(ori != dest){
            origin = ori;
            destination = dest;
        }else{
            throw new IllegalArgumentException();
        }
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    public boolean bookASeat(){
        if(numberOfSeatsLeft>0 ){
            numberOfSeatsLeft--;
            System.out.println("--Booking Success!--");
            return true;
        }
        System.out.println("--Booking Failure!--");
        return false;
    }
    @Override
    public String toString() {
        return String.format("Flight %d, %s to %s, %s, Original Price: $%.2f",
                flightNumber,origin,destination,departureTime,originalPrice);
    }
    
    

    
    
}
