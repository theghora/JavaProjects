
package q7;


public class EncryptionOne extends Implementation {
    @Override
    public String encrypt(String s) {
        String R = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            R += s.charAt(i);
        }
        return R;
    }

    @Override
    public int encrypt(int i) {
        return i*2 + 1;
    }  
}
