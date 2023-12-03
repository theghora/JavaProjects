package coe318.lab6;
public class Node {
     private static int nums =1;
     private int nodenum=0;

     public Node() {
         nodenum = nums;
         nums += 1;
     }
     @Override
    public String toString(){
        return "Node:"+nodenum;
    }
}
