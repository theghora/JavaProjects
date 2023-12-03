package coe318.lab6;

import java.util.ArrayList;
import java.util.Currency;

public class Circuit {
    private static Circuit instance = null;

    private static ArrayList<Resistor> circuitt= new ArrayList<Resistor>();;

    public static Circuit getInstance() {
        if (instance == null) { instance = new Circuit();}
        return instance;
    }
    private Circuit() {
        
    } //Yes, the constructor is PRIVATE!

    public void add(Resistor r) {
        circuitt.add(r);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < circuitt.size(); i++) {
            s+=String.valueOf(circuitt.get(i)) + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Circuit cir = Circuit.getInstance();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Resistor A = new Resistor(100, n1, n2);
        Resistor B = new Resistor(200, n2, n3);
        cir.add(A);
        cir.add(B);
        System.out.println(cir);
    }
}
