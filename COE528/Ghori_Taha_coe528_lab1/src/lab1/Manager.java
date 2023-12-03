/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tahag
 */
public class Manager {
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    public void createFlights() {
        int flightnum = 0;
        String n = "";
        int d = 0;
        double k = 0;
        String[] a = { "", "", "" };

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t We Will Now Ask You To Input Flight Details. Make Sure They Are Correct\n");

        //while(n==0){
        System.out.println("--Please Enter Information in this order \n\t Flight Number, "
                + "Origin, Destination, Departure Time, Capacity, Price\n");

        try {
            flightnum = scan.nextInt();
            n = scan.next();
            a[0] = scan.nextLine();
            a[1] = scan.nextLine();
            a[2] = scan.next();
            d = scan.nextInt();
            k = scan.nextFloat();
            //n++;
        } catch (Exception e) {
            System.err.println("Wrong Input(s) detected, please try again");
            scan.reset();
            //continue;
        }
        // }
        //System.out.println(flightnum +n+ a[0]+a[1]+a[2]+d+k);
        Flight f = new Flight(flightnum, n, a[1], a[2], d, k);
        
        System.out.println("Added a Flight to list:"+f);
        flights.add(f);  
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for(int i=0; i<flights.size();i++){
            if(flights.get(i).getOrigin().equals(origin) &&
                    flights.get(i).getDestination().equals(destination) &&
                    flights.get(i).getNumberOfSeatsLeft()>0){
                
               System.out.println(flights.get(i));
                
            }
        }          
    }
    
    public Flight getFlight(int flightnumber){
       Flight w=null;
       for(int i=0; i<flights.size();i++){
            if(flights.get(i).getFlightNumber() == flightnumber){
                return flights.get(i);
            }
        }
       
        System.out.println("Could Not Find Flight With Inputted Flight Number");
        return w;
    }
    
    public void bookSeat(int flightnumber, Passenger p){
        Flight w = null;
        for(int i=0; i<flights.size();i++){
            if(flights.get(i).getFlightNumber() == flightnumber){
                w = flights.get(i);
            }
        }
        if(flights.contains(w)){  
            double price;
            try{
                
                boolean x;
                x = w.bookASeat();  
                
                if(x==false){
                    throw new Exception();
                }
                
                price = p.applyDiscount(w.getOriginalPrice());
                Ticket t = new Ticket(p,w,price);
                tickets.add(t);
                System.out.println("--Ticket Generated: \n"+t+"\n");
            }catch(Exception e){
                System.out.println("Could Not Book a Seat");
            }
        }else{
            System.out.println("Could Not Find Matching Flight Number,Please Input");
        }
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    
    public static void main(String[] args){
        Manager M = new Manager();
        
        Member r = new Member(31,"Candice");//wants flight (456)
        r.setYearsOfMembership(3);
        
        Member x = new Member(76, "Billy"); //wants flight (123)
        x.setYearsOfMembership(20);
        
        Member y = new Member(8 ,"Ryan"); //wants flight (456)
        y.setYearsOfMembership(0);
        
        NonMember z = new NonMember(24, "Joe");//wants flight(789)
        NonMember q = new NonMember(80, "Xavier");//wants flight (789)
        
        M.createFlights(); // from a to b
        M.createFlights(); // from c to d
        M.createFlights(); // from e to f
        
        M.displayAvailableFlights("a", "b");
        
        Flight result = M.getFlight(789);
        
        System.out.println("\n\tFound Flight: "+result);
        
        M.bookSeat(456, r);  //different people with different ages used to test discount
        M.bookSeat(123, x);
        M.bookSeat(456, y);
        M.bookSeat(789, z);
        M.bookSeat(789, q);
        
    }
}
