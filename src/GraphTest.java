public class GraphTest {
    public static void main(String[] args)  {
        // must specify ahead of time for this implementation
        int[][] test1 = {{4,3,1},{3,2,4},{3},{4},{}};
        Graph graph = new Graph(test1);
        System.out.println("Every path should include 0 at the start of the array.");
        System.out.println(graph.allPaths(test1));
    }
}
