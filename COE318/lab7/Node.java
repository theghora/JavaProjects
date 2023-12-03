package coe318.lab7;
public class Node {
    private int nodenum = 0;
    
    public Node(int num) {
        nodenum = num;
    }
    /**
     * 
     * @return returns the number that this node is
     */
    public int getNodenum() {
        return nodenum;
    }

    /**
     * @return Returns the Node as a string
     */
    @Override
    public String toString(){
        return ""+nodenum;
    }
}
