package lab3;

/**
 *
 * @author tahag
 */
import java.util.ArrayList;
public class QueueOfDistinctStrings {
    
    
// Overview: QueueOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// FIFO (First-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
//
//  AF(c) = a abstract Queue d (where c is a Queue of Distinct Strings Object in FIFO)
//              where d.front = items.get(0)                     
//                    d.end = items.get(items.size()-1) 
//                    d.{} = items.get(1),...,items.get(items.size()-1)
// Implements in toString()                     
    
//  The rep invariant is:
// b) Write the rep invariant here
//          
//      RI(c) = False if items contains more than 1 of a certain string
//            = True otherwise
//              
//  Implements in RepOK()
//
    
    
private ArrayList<String> items;  //the rep

public QueueOfDistinctStrings () {     // constructor
    // EFFECTS: Creates a new QueueOfDistinctStrings object
    items = new ArrayList<String>();
}


// MODIFIES: this
// EFFECTS: Appends the element at the end of the queue
// if the element is not in the queue, otherwise
// does nothing.
public void enqueue(String element) throws Exception {
    
    if(element == null) throw new Exception();
    
    if(false == items.contains(element)) items.add(element);
    
}
public String dequeue() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the front of the queue
    if (items.size() == 0) throw new Exception();
    
    return items.remove(0);
}
public boolean repOK() {
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
// c) Write the code for the repOK() here
    for (int i =0;i<items.size();i++){
        int count=0;       
        for(int j=0; j<items.size();j++){
            if(items.get(i)==items.get(j)){
                count++;
            }
            if(count>1){
                return false;
            }
        }
    }
    return true;
}

@Override
public String toString() {
// EFFECTS: Returns a string that contains the strings in the
// queue, the front element and the end element.
// Implements the abstraction function.
// d) Write the code for the toString() here
    String ss = ""; 
    for(int i=1; i<items.size()-1;i++){
       ss+=items.get(i)+",";
    }
    return "Front:" + items.get(0)+ ", End:"+items.get(items.size()-1)+"\n Collection:"+ss;
}
}
