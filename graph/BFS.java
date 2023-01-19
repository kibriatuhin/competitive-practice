package graph;

import java.util.ArrayList;
import java.util.Iterator;

class BreathFirstSearch{
    int noOfVertex;
    ArrayList<Integer>[] adjacency;

    BreathFirstSearch(int noOfVertex){
        this.noOfVertex = noOfVertex;
        this.adjacency = new ArrayList[noOfVertex];//6   -0-5
        for (int i=0 ; i< noOfVertex ; i++){
            adjacency[i] = new ArrayList<>();
        }
    }

    void edge(int x , int y){
        adjacency[x].add(y);
    }

    void breathFirstSearch(int sourceVertex){

        boolean[] visited = new boolean[noOfVertex];
        ArrayList<Integer> arrayList = new ArrayList<>();//1
        visited[sourceVertex] = true;
        arrayList.add(sourceVertex);//0

        while (!arrayList.isEmpty()){
            sourceVertex = arrayList.remove(0);
            System.out.print(sourceVertex + " ");
            Iterator<Integer> iterator = adjacency[sourceVertex].iterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if (!visited[n]){
                    visited[n] = true;
                    arrayList.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreathFirstSearch bf = new BreathFirstSearch(6);
        bf.edge(0,1);
        bf.edge(0,2);
        bf.edge(0,5);
        bf.edge(1,0);
        bf.edge(1,2);
        bf.edge(2,0);
        bf.edge(2,1);
        bf.edge(2,3);
        bf.edge(2,4);
        bf.edge(3,2);
        bf.edge(4,2);
        bf.edge(4,5);
        bf.edge(5,0);
        bf.edge(5,2);
        bf.edge(5,4);

        bf.breathFirstSearch(0);

    }
}

