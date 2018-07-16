package com.plamenti;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private String name;
    private boolean isVisited;
    List<Vertex> neighborList;

    public Vertex(String name){
        this.name = name;
        this.neighborList = new ArrayList<Vertex>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isVisited(){
        return isVisited;
    }

    public void setVisited(boolean visited){
        isVisited = visited;
    }

    public List<Vertex> getNeighborList(){
        return new ArrayList<Vertex>(neighborList);
    }

    public void setNeighborList(List<Vertex> neighborList){
        this.neighborList = new ArrayList<Vertex>(neighborList);
    }

    public void addNeighbor(Vertex vertex){
        this.neighborList.add(vertex);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
