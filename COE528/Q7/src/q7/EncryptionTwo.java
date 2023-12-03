
package q7;


public class EncryptionTwo extends Implementation{
    @Override
    public String encrypt(String s) {
        return "2" + s + "2";
    }
    
    @Override
    public int encrypt(int i) {
        return (i * 3) + 2;
    }
}
