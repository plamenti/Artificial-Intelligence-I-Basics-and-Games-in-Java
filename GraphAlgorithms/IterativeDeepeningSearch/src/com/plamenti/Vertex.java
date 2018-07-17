package com.plamenti;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private String name;
    private int depthLevel;
    List<Vertex> neighbors;

    public Vertex(String name){
        this.name = name;
        this.depthLevel = 0;
        this.neighbors = new ArrayList<Vertex>();
    }

    public String getName(){
        return name;
    }

    public int getDepthLevel(){
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel){
        this.depthLevel = depthLevel;
    }

    public List<Vertex> getNeighbors(){
        return new ArrayList<Vertex>(neighbors);
    }

    public void addNeighborVertex(Vertex vertex){
        this.neighbors.add(vertex);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
