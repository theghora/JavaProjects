package coe318.lab7;

/**
 * The type Resistor.
 */
public class Resistor {
    private double R;
    private Node N1,N2;
    private static int res = 1;
    private int resnum;
    private Node[] Nodes = new Node[2];

    /**
     * Instantiates a new Resistor.
     *
     * @param resistance The magnitude of resistence that the Resistor has
     * @param node1      The First node that the Resistor is connected to
     * @param node2      The Second Node that the Resistor is connected to
     */
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance <0) {
            throw new IllegalArgumentException("i cannot be negative or null");
        }else{
            R = resistance;
        }
        N1 = node1;
        N2 = node2;
        resnum = res;
        res+=1;
    }

    /**
     * Get nodes node [ ].
     *
     * @return returns the 2 nodes that the resistor is connected to as an array
     */
    public Node[] getNodes() {
        Nodes[0] = N1;
        Nodes[1] = N2;
        return Nodes;
    }

    /**
     * To string string.
     *
     * @return returns the String repersentation of the Resistor
     */
    @Override
    public String toString(){
        return "R"+resnum+"\t"+N1+"\t"+N2+"\t"+R;
    }

}

