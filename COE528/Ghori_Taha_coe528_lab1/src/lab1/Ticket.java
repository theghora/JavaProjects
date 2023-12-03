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
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int currentnumber=1;
    private int number;
    
    public Ticket(Passenger p, Flight f, double pri){
        number=currentnumber;
        currentnumber++;
        passenger=p;
        flight=f;
        price=pri;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCurrentnumber() {
        return currentnumber;
    }

    public static void setCurrentnumber(int currentnumber) {
        Ticket.currentnumber = currentnumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s ,Flight %d, %s to %s, %s, Original Price: $%.2f, "
                + "Ticket Price: $%.2f",passenger.getName(),flight.getFlightNumber(),flight.getOrigin()
                ,flight.getDestination(),flight.getDepartureTime(),flight.getOriginalPrice(),price);
    }
    
    
}
