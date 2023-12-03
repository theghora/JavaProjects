package coe318.lab7;
public class Source {
        private double V=0;
        private Node n1,n2;
        private static int source=1;
        private int sourcenum = 0;
        private Node positiveside;
        private Node[] Nodes = new Node[2];

    public Source(Node node1, Node node2, double voltage){
            if (voltage <0 ) {
                throw new IllegalArgumentException("i cannot be negative or null");
            } else {
             V = voltage;    
            }
            n1 = node1;
            n2 = node2;
            /* if (n1.getNodenum() > n2.getNodenum()) {
                V = V * (-1);
            } */
            sourcenum = source;
            source+=1;
        }
        public Node[] getNodes(){
            Nodes[0]= n1;
            Nodes[1] =n2;
            return Nodes;
        }

        /**
         * @return returns the String repersentation of the Source
         */
        @Override
        public String toString(){
            return "V"+sourcenum+"\t"+n1+"\t"+n2+"\t"+"DC "+V;
        }
}
