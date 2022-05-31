/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

/**
 *
 * @author CATECH
 */
public class Edge {
     private int start;
   private int destination;
   private double weight;
   public Edge(int start, int destination, double weight){
       this.start = start;
       this.destination = destination;
       this.weight = weight;
   }

    public int getStart() {
        return start;
    }

    public int getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
    
}
