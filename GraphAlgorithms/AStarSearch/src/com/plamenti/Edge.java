package com.plamenti;

public class Edge{
    public final double cost;
    public final Node targetNode;

    public Edge(double cost, Node targetNode){
        this.cost = cost;
        this.targetNode = targetNode;
    }

    public double getCost(){
        return cost;
    }

    public Node getTargetNode(){
        return targetNode;
    }
}
