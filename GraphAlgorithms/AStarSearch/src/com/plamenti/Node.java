package com.plamenti;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{
    private String value;
    private double gScore;
    private double fScore;
    private double x;
    private double y;
    private List<Edge> adjacenciesList;
    private Node parentNode;

    public Node(String value){
        this.value = value;
        this.adjacenciesList = new ArrayList<Edge>();
    }

    public double getGScore(){
        return gScore;
    }

    public void setGScore(double gScore){
        this.gScore = gScore;
    }

    public double getFScore(){
        return fScore;
    }

    public void setFScore(double fScore){
        this.fScore = fScore;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public List<Edge> getAdjacenciesList(){
        return new ArrayList<Edge>(adjacenciesList);
    }

    public Node getParentNode(){
        return parentNode;
    }

    public void setParentNode(Node parentNode){
        this.parentNode = parentNode;
    }

    @Override
    public String toString(){
        return this.value;
    }

    @Override
    public int compareTo(Node o){
        return Double.compare(this.fScore, o.getFScore());
    }
}
