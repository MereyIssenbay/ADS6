// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph(5);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(2, 4);
        myGraph.addEdge(2, 0);
        myGraph.addEdge(3, 4);
        myGraph.printGraph();
        System.out.println(myGraph.hasEdge(0,4));
        System.out.println(myGraph.getNeighbor(1));
        System.out.println(myGraph.getNeighbor(0));
        myGraph.DFS(2);
    }
}