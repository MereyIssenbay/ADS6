import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph<>();
        Vertex<Integer> s1 = new Vertex<>(1);
        Vertex<Integer> s2 = new Vertex<>(2);
        Vertex<Integer> s3 = new Vertex<>(3);
        Vertex<Integer> s4 = new Vertex<>(4);
        Vertex<Integer> s5 = new Vertex<>(5);
        myGraph.addEdge(s1, s2, 5d);
        myGraph.addEdge(s1, s3, 6d);
        myGraph.addEdge(s2, s4, 7d);
        myGraph.addEdge(s2, s5, 8d);
        myGraph.dijkstra(s1);

        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> v1 = new Vertex<>("A");
        Vertex<String> v2 = new Vertex<>("B");
        Vertex<String> v3 = new Vertex<>("C");
        Vertex<String> v4 = new Vertex<>("D");
        Vertex<String> v5 = new Vertex<>("E");

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addEdge(v1, v2, 1);
        graph.addEdge(v1, v3, 4);
        graph.addEdge(v2, v3, 2);
        graph.addEdge(v2, v4, 5);
        graph.addEdge(v3, v4, 1);
        graph.addEdge(v4, v5, 3);

        BFS<String> bfs = new BFS<>(graph);
        System.out.println("BFS:");
        bfs.BFS(v1);

    }
}