package com.plamenti;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DFS dfs = new DFS();

        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");

        vertex1.addNeighborVertex(vertex2);
        vertex1.addNeighborVertex(vertex4);
        vertex4.addNeighborVertex(vertex5);
        vertex2.addNeighborVertex(vertex3);

        List<Vertex> vertices = new ArrayList<>();
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);
        vertices.add(vertex4);
        vertices.add(vertex5);

        dfs.dfs(vertices);
    }
}
