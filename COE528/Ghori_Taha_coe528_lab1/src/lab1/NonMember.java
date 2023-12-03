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
public class NonMember extends Passenger {
    
    public NonMember(int a, String n) {
        super(a, n);
    }

    @Override
    public double applyDiscount(double p) {
        if(age >65){
            return p=0.9*p;
        }else{
            return p;
        }    
    }
}
