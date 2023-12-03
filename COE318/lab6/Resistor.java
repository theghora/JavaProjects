package coe318.lab6;
public class Resistor {
    private double R;
    private Node N1,N2;
    private static int res = 1;
    private int resnum;
    private Node [] Nodes= new Node[2];

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

    public Node[] getNodes(){
        Nodes[0]= N1;
        Nodes[1] =N2;
        return Nodes;
    }
    @Override
    public String toString(){
        return "R"+resnum+"\t"+N1+"\t"+N2+"\t"+R+" Ohms";
    }

}

