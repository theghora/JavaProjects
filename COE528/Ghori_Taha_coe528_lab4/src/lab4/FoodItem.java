
package lab4;

/**
 *
 * @author Taha Ghori - 501102847
 */

//like a file
public class FoodItem extends FoodComponent{
    private final double price;
    private final String name;
    
    public FoodItem(String thing,double p) {
        this.price = p;
        this.name = thing;
    }

    @Override
    public void print(int level) {
        String s="";
        for(int i =0; i<level;i++){
            s+="\t";
        }
        level++;
        System.out.println(s+"FoodItem: "+name+","+price);
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void add(FoodComponent f) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void remove(FoodComponent f) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

  
    
    
}
