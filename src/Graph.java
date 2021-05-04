import java.util.ArrayList;
import java.util.List;
public class Graph {
    // data members, the graph provided as a 2d array
    protected int[][] graph;
//    protected List<List<Integer>> result;
    // constructor
    public Graph(int[][] graph){
        this.graph = graph;
    }
    private void allPaths(int[][] graph, int node, List<Integer> current, List<List<Integer>> result) {
        if (node == graph.length-1){
            // add a new arraylist to the results list
            result.add(new ArrayList<>(current));
            return;
        }
        else {
            for (int i : graph[node]) {
                current.add(i);
                allPaths(graph, i, current, result);
                // remove last item in the iterable array
                current.remove(current.size()-1);
            }
        }
    }
    // takes the graph parameter and returns a 2d array with all possible paths from vertex 0 -> n-1
    public List<List<Integer>> allPaths(int[][] graph) {
        if (graph.length==0||graph[0].length==0) {
            System.out.println("Graph is either empty, or was not instantiated correctly.");
        }
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        // always start at 0
        allPaths(graph,0,current,result);
        return result;
    }
}
