
package q7;


public class UserProfile extends Abstraction{
    private String name;
    private int ID;
    Implementation E;

    public UserProfile(Implementation e, String n, int id) {
        E = e;
        ID = id;
        name = n;
    }

    @Override
    public void print() {
        String name2 = E.encrypt(name);
        int ID2 = E.encrypt(ID);
        System.out.println(name2 + " " + ID2);
    }
    
    @Override
    public void setEncryption(Implementation e){
        E = e;
    }
    
}
