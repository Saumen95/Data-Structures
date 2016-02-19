import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sameenislam on 19/02/2016.
 */
public class BreadthFirstSearch {

    public void bfs(Vertex root) {

        // a BFS algorithm requires a queue data structure - i.e. FIFO.
        Queue<Vertex> queue = new LinkedList<>();

        // visit root node and add it to the queue
        root.setVisited(true);
        queue.add(root);

        while( !queue.isEmpty() ) {
            Vertex actualVertex = queue.remove(); // take node out of queue
            System.out.print(actualVertex+"-");

            // get neighbouring vertices for loaded vertex
            for(Vertex v : actualVertex.getNeighbourList()) {
                if( !v.isVisited() ) {
                    // if the neighbouring vertex has not been visited...
                    v.setVisited(true);
                    queue.add(v); // visited nodes get added to queue
                }
            }
        }
    }
}
