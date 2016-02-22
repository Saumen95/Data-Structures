package AStar;

import com.sun.tools.internal.xjc.reader.gbind.SourceNode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by sameenislam on 22/02/2016.
 */
public class Algorithm {

    public void aStarSearch(Node sourceNode, Node goalNode) {
        Set<Node> exploredNodes = new HashSet<>();

        PriorityQueue<Node>  unexploredNodesQueue = new PriorityQueue<>();
        sourceNode.setgScore(0);
        unexploredNodesQueue.add(sourceNode);
        boolean isFound = false;

        while ( !unexploredNodesQueue.isEmpty() && !isFound ) {
            Node currentNode = unexploredNodesQueue.poll();
            unexploredNodesQueue.add(currentNode);

            if(currentNode.getValue().equals(goalNode.getValue())) {
                isFound = true;
            }

            for(Edge edge : currentNode.getAdjacenciesList()) {
                Node childNode = edge.getTargetNode();
                double cost = edge.getCost();
                double tempGScore = currentNode.getfScore() + cost;
                double tempFScore = tempGScore + heuristic(childNode, goalNode);

                if( exploredNodes.contains(childNode) && tempFScore>=childNode.getfScore()) {
                    continue;
                } else if( !unexploredNodesQueue.contains(childNode) || (tempFScore < childNode.getfScore())) {
                    childNode.setParentNode(currentNode);
                    childNode.setgScore(tempGScore);
                    childNode.setfScore(tempFScore);

                    if( unexploredNodesQueue.contains(childNode)) {
                        unexploredNodesQueue.remove(childNode);
                    }
                    unexploredNodesQueue.add(childNode);

                }

            }

        }

    }

    // Manhattan heuristic. Different to Euclidean distance.
    private double heuristic(Node node1, Node node2) {
        return Math.abs(node1.getX()-node2.getY()) + Math.abs(node1.getY()-node2.getY());
    }
}
