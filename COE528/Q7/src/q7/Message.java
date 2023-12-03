
package q7;

public class Message extends Abstraction {  
    String[] strings;
    Implementation E;

    public Message(Implementation e, String[] s) {
        E = e;
        strings = s;
    }
    
    @Override
    public void print() {
        String R = "";
        for (String string : strings) {
            R += E.encrypt(string) + " ";
        }
        System.out.println(R);
    }
    
    @Override
    public void setEncryption(Implementation e){
        E = e;
    }
}
