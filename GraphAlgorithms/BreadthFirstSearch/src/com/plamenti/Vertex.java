package com.plamenti;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private int data;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(int data){
        this.data = data;
        this.neighborList = new ArrayList<>();
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public List<Vertex> getNeighborList(){
        return new ArrayList<>(this.neighborList);
    }

    public void setNeighborList(List<Vertex> neighborList){
        this.neighborList = new ArrayList<>(this.neighborList);
    }

    public void addNeighborVertex(Vertex vertex){
        this.neighborList.add(vertex);
    }

    @Override
    public String toString(){
        return "" + this.data;
    }
}
