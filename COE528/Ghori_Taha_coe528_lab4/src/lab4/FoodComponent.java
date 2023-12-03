
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Taha Ghori - 501102847
 */

//Every folder and file is a part of this
public abstract class FoodComponent {
    
    private static ArrayList<FoodComponent> F = new ArrayList<FoodComponent>();

    
    public abstract void add(FoodComponent f);
    
    public abstract void remove(FoodComponent f);
    
    public abstract double getPrice();
    
    public abstract void print(int level);
    
}
