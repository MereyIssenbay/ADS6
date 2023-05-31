import java.util.*;
public class BFS<V> extends Search<V> {
    private Set<Vertex<V>> visited;

    public BFS(WeightedGraph<V> graph) {
        super(graph);
        visited = new HashSet<>();
    }

    public void BFS(Vertex start){
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            Set<Vertex<V>> neighbors = currentVertex.getAdjVertices().keySet();
            for (Vertex<V> neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}