
package q7;


abstract class Abstraction {
    private Implementation X;
    
    public String encrypt(String s){
        return X.encrypt(s);
    }
    
    public int encrypt(int i){
        return X.encrypt(i);
    }
    
    public abstract void setEncryption(Implementation E);
    public abstract void print();
}
