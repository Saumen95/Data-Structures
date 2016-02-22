package AStar;

import java.util.List;

/**
 * Created by sameenislam on 22/02/2016.
 */
public class Main {

    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");

        node1.addNeighbour(new Edge(node2, 10));
        node1.addNeighbour(new Edge(node4, 100));
        node2.addNeighbour(new Edge(node3, 10));
        node3.addNeighbour(new Edge(node4, 10));

        Algorithm algorithm = new Algorithm();

        algorithm.aStarSearch(node1, node4); // find shortest path from node 1 to node 4

        List<Node> path = algorithm.printPath(node4); // node4 is the target for the pathfinder
        System.out.println(path);

        // path doesn't print. program seems to be broken.
    }
}
