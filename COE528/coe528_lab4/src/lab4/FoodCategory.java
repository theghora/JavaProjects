
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Taha Ghori - 501102847
 */

//like a folder
public class FoodCategory extends FoodComponent {
    private final String name;
    private double sum;
    private ArrayList<FoodComponent> F;

    public FoodCategory(String thing) {
        name = thing;
        F=new ArrayList<>();
    }

    
    @Override
    public void print(int level) {
        
        String s="";
        for (int i =0; i<level;i++){
            s+="\t";
        }
        level++;
        
        System.out.println(s+"FoodCatagory ("+this.name+","+this.getPrice()+") contains:");
        
        for(int i =0; i <F.size();i++){
            F.get(i).print(level);
        }
    }

    @Override
    public double getPrice() {
        sum=0;
        for (int i=0; i<F.size();i++){
            
            sum+=F.get(i).getPrice();
            
        }
        return sum;
    }

    @Override
    public void remove(FoodComponent f) {
        F.remove(f);
    }

    @Override
    public void add(FoodComponent f) {
       F.add(f);
    }

    
    
    
}
