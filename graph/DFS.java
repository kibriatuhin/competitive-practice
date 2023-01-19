package graph;

import java.util.ArrayList;
import java.util.Stack;

class DepthFirstSearch{
    int noOfVertex;
    ArrayList<Integer>[] adjecency;
    DepthFirstSearch(int noOfVertex){
        this.noOfVertex = noOfVertex;
        adjecency = new ArrayList[noOfVertex];
        for (int i=0 ; i< noOfVertex ; i++){
            adjecency[i] = new ArrayList<>();
        }
    }
    void edge(int x , int y){
        adjecency[x].add(y);

    }
    void  depthFirstSearch(int sourceVertex){
        boolean[] visited = new boolean[noOfVertex];
        Stack<Integer> stack = new Stack<>();

        stack.push(sourceVertex);
        int node ;
        while (!stack.empty()){
            sourceVertex = stack.peek();
            stack.pop();
            for (int i=0 ; i< adjecency[sourceVertex].size(); i++){
                node = adjecency[sourceVertex].get(i);
                if (!visited[node] ){
                    stack.push(node);

                }
            }
            if (visited[sourceVertex] == false){
                System.out.print(sourceVertex + " ");
                visited[sourceVertex] = true;

            }
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch(6);
        dfs.edge(0,1);
        dfs.edge(0,2);
        dfs.edge(0,5);
        dfs.edge(1,0);
        dfs.edge(1,2);
        dfs.edge(2,0);
        dfs.edge(2,1);
        dfs.edge(2,3);
        dfs.edge(2,4);
        dfs.edge(3,2);
        dfs.edge(4,2);
        dfs.edge(4,5);
        dfs.edge(5,0);
        dfs.edge(5,2);
        dfs.edge(5,4);

        dfs.depthFirstSearch(0);
    }
}