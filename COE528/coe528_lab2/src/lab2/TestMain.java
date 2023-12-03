/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author tahag
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //int RFtest=ProceduralAbstraction.reverseFactorial(119);
        //System.out.println("\t"+RFtest);
        
        
        int[][] arr1 ={
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };
        int[][] arr2 = {
            {-3,1,0},
            {4,-3,4},
            {7,-9,0}
        };
        
        boolean n = ProceduralAbstraction.isMatrixNice(arr1);
        boolean m = ProceduralAbstraction.isMatrixNice(arr2);
    }
    
}
