/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;

/**
 *
 * @author tahag
 */
public class ProceduralAbstraction {

    public ProceduralAbstraction() {
    }
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.
    /*
    public static int reverseFactorial(int x){
        int n=1;
        for(int i=1; i<x;i++){
            n*=i;
            if(n>=x){
                return i;
            }
        }   
        return 1;   
    }
    */
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.
    public static boolean isMatrixNice(int[][] arr){
        boolean one=false;
        int x,y=0;       
        
        y=arr.length;  //gets # of rows
        x=arr[0].length;  //gets # of columns
        if (x==y){
            one=true;
        }else if (x!=y){
            System.out.println("Matrix is Not Nice 1");
            return false;
        }
        
        int[] srow,scolumn,sdiagonal;
        sdiagonal = new int[x];
        srow = new int[x];
        scolumn = new int[x];
        
        for(int i=0;i<x;i++){    
            for(int j=0; j<y;j++){
                srow[i] +=arr[i][j];
                scolumn[i] +=arr[j][i];
                sdiagonal[i]+=arr[j][j];
            }
        }
        
        if (Arrays.equals(srow, scolumn) && Arrays.equals(scolumn, sdiagonal) 
                && Arrays.equals(sdiagonal, srow)){
            int R=0;
            for(int i =0; i<x;i++){    
                R += srow[i] +scolumn[i]+sdiagonal[i];
            }
            System.out.println("Matrix is Nice, Sum of Ints in Matrix is: "+R);
            return true;
        }
        System.out.println("Matrix is Not Nice 2");
        return false;
    }
}
