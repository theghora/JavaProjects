package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * a
 * @author Taha Ghori
 */
public class UserMain {
    public static void main(String[] args) {
        Circuit cir = Circuit.getInstance();
        String s = "";
        System.out.println("Enter Voltage Sources and Resistors");
        while (!s.equals("spice") && !s.equals("end")) {
            Scanner scan = new Scanner(System.in);
            s = scan.next();
            if (s.equals("v") || s.equals("V")) {
                s = scan.next();
                int e = Integer.valueOf(s);
                Node E = new Node(e);
                s = scan.next();
                int r = Integer.valueOf(s);
                Node R = new Node(r);
                s = scan.next();
                double k = Double.valueOf(s);
                Source sr = new Source(E, R, k);
                cir.adds(sr);
            }
            if (s.equals("r") || s.equals("R")) {
                s = scan.next();
                int e = Integer.valueOf(s);
                Node E = new Node(e);
                s = scan.next();
                int r = Integer.valueOf(s);
                Node R = new Node(r);
                s = scan.next();
                double k = Double.valueOf(s);
                Resistor sr = new Resistor(k, E, R);
                cir.addr(sr);
            }
        }
        if (s.equals("end")) {
            System.out.println("\n"+"\t-ALL DONE-");
        } else if (s.equals("spice")) {
            System.out.println("\n"+cir+"\n\t-ALL DONE-");
        }
    }
}
