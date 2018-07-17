package com.plamenti;

public class Main {

    public static void main(String[] args) {
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");

        vertex1.addNeighborVertex(vertex2);
        vertex1.addNeighborVertex(vertex3);
        vertex2.addNeighborVertex(vertex4);
        vertex3.addNeighborVertex(vertex5);

        IDDFS iddfs = new IDDFS(vertex4);
        iddfs.runDeepeningSearch(vertex1);
    }
}
