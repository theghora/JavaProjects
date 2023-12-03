package coe318.lab4;

public class Account {
     String namee;
     double balancee;
     int numm;

    public Account(String name, int number, double initialBalance){
        namee = name;
        balancee=initialBalance;
        numm=number;
    }
    public String getName(){
        return namee;
    }
    public double getBalance(){
        return balancee;
    }
    public int getNumber(){
        return numm;
    }
    public boolean withdraw(double take){
        if(balancee >= take && take >0){
            balancee-=take;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposit(double putin){
        if (putin > 0) {
            balancee += putin;
            return true;
        }else {
            return false;
        }
    }




    @Override public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
}
