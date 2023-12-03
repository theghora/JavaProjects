/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author tahag
 */
public class QueueOfDistinctStringsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueOfDistinctStrings list1 = new QueueOfDistinctStrings();
        String a = "ab";
        String b= "bn";
        String c= "ae";
        String d= "bd";
        
        try{
            list1.enqueue(a);
            list1.enqueue(b);
            list1.enqueue(c);
            list1.enqueue(d);
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.println(list1.repOK());
        System.out.println(list1);
    }
    
}
