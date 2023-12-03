
package lab4;

import java.io.*;
import java.lang.Exception.*;

/**
 *
 * @author Taha Ghori - 501102847
 */
public class Record {
    
    // Name of the associated file
    private String filename;
    private static Record instance=null;

    private Record(String n) {
    filename = n;
    }

    public static Record getInstance(String n){
        if (instance==null){
            Record x = new Record(n);
            return x;
        }else{
            return instance;
        }
    }
    

// Effects: Reads and prints the contents of the associated file to the standard output.
    public void read() {
         
        try {
            
            FileReader r = new FileReader(filename);
            BufferedReader bf = new BufferedReader(r);
            String Line;
            while((Line = bf.readLine())!=null){
                System.out.println(Line);
            }
            r.close();
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }   
    
    
    
    
// Effects: Appends the specified message, msg, to the associated file. 
    public void write(String msg) {
        try {
            FileWriter w = new FileWriter(filename,true);
            w.write(msg);
            w.close();
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)______________________________________ ;
        // Do not modify the code below
        
        String Filename = "record.txt";
        Record r = getInstance(Filename);
        
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();
        }
}