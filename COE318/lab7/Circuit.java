package coe318.lab7;

import java.util.ArrayList;
import java.util.*;
import java.util.Currency;

public class Circuit {
    private static Circuit instance = null;

    private static ArrayList<Object> circuitt= new ArrayList<Object>();

    public static Circuit getInstance() {
        if (instance == null) { instance = new Circuit();}
        return instance;
    }
    private Circuit() {

    } //Yes, the constructor is PRIVATE!
/**
 * 
 * @param r The resistor that is being added to the circuit
 */
public void addr(Resistor r) {
    circuitt.add(r);
}
    /**
     * 
     * @param s the Voltage source being added to the circuit
     */
    public void adds(Source s){
        circuitt.add(s);
    }

    /**
     * @return Returns the whole circuit repersent in string format
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < circuitt.size(); i++) {
            s+=String.valueOf(circuitt.get(i)) + "\n";
        }
        return s;
    }
}
