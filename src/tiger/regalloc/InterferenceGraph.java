package tiger.regalloc;

import tiger.graph.Graph;
import tiger.graph.Node;
import tiger.temp.Temp;


abstract public class InterferenceGraph extends Graph {
   abstract public Node tnode(Temp temp);
   abstract public Temp gtemp(Node node);
   abstract public MoveList moves();
   public int spillCost(Node node) {return 1;}
}
