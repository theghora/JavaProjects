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
public class Member extends Passenger{
    private int yearsOfMembership;

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    public Member(int a, String n) {
        super(a, n);
        
    }

    @Override
    public double applyDiscount(double p) {
        if(yearsOfMembership>5){
           return p=p*0.5;
        }
        if(5>yearsOfMembership && yearsOfMembership>1){
            return p=p*0.9;
        }
        else{
            return p;
        }
    }
}
