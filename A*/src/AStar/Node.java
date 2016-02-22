package AStar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sameenislam on 22/02/2016.
 */
public class Node implements Comparable<Node> {

    // the name of the node
    private String value;

    // gScore tracks distance from given node to other node.
    private double gScore;

    // It also factors in the output of the heuristic function, which is hScore.
    private double hScore;

    // The sum of the two determines if we make the jump or not.
    private double fScore;

    // set up topology. Cartesian coordinate system.
    // defines a position in the 2D space.
    private double x;
    private double y;

    private List<Edge> adjacenciesList;
    private Node parentNode;

    public Node(String value) {
        this.value = value;
        adjacenciesList = new ArrayList<Edge>();

    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public int compareTo(Node otherNode) {
        return Double.compare(this.fScore, otherNode.getfScore());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public double gethScore() {
        return hScore;
    }

    public void sethScore(double hScore) {
        this.hScore = hScore;
    }

    public double getfScore() {
        return fScore;
    }

    public void setfScore(double fScore) {
        this.fScore = fScore;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
