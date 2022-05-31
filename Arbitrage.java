/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbitrage;

import graph.Graph;
import io.ReadFile;

public class Arbitrage {
     public static void main(String[] args) {
        ReadFile rf = new ReadFile("arbi.txt");
        Graph g = rf.makeGraph();
//        for(int i : g.getVertices()){
//           BellmanFord bl = new BellmanFord(g, i-1); 
//        }
         Arbitrage src = new Arbitrage(g, 0);
    }

 public Arbitrage (Graph graph,int src)
    {
        int V = graph.getVertices().length;
        int E = graph.getEdges().size();
        double dist[] = new double[V];
        int lastNode[] = new int[V];
        int output[] = new int[V];
        for (int i=0; i<V; ++i){
            dist[i] = Integer.MAX_VALUE;
            output[i] = -1;
        }
        dist[src] = 0;
        
        for (int i=1; i<V; ++i)
        {
            for (int j=0; j<E; ++j)
            {
                int u = graph.getEdges().get(j).getStart()-1;
                int v = graph.getEdges().get(j).getDestination()-1;
                double weight = graph.getEdges().get(j).getWeight();
                if (dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    lastNode[v] = u;
                }
            }
        }
        int cycleNo = 0;
        for (int j=0; j<E; ++j)
        {
            int u = graph.getEdges().get(j).getStart()-1;
            int v = graph.getEdges().get(j).getDestination()-1;
            double weight = graph.getEdges().get(j).getWeight();
            if (dist[u] != Integer.MAX_VALUE && dist[u]+weight < dist[v]){
                cycleNo++;
            }
        }
        //
        System.out.println("Graph contains " + cycleNo + " negative weight cycles.");
        int prev = 0;
        int index = 0;
        for(int i : lastNode){
            if(i == prev) continue;
            prev = i;
            output[index] = i;
            index++;
        }
        System.out.print("The output sequence is: ");
        for(int i: output)
            if(i != -1)
                System.out.print(i + ", ");
    }
  
}
