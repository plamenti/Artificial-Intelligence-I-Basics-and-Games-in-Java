package com.plamenti;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS{
    public void bfs(Vertex root){
        Queue<Vertex> queue = new ArrayDeque<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex currentVertex = queue.remove();
            System.out.println(currentVertex + "    ");

            for(Vertex vertex : currentVertex.getNeighborList()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
