package com.plamenti;

import java.util.List;
import java.util.Stack;

public class DFS{
    Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

    // This method is necessary if we have graph that contains clusters with vertexes that are not connected
    public void dfs(List<Vertex> vertexList){
        for(Vertex vertex : vertexList){
            if(!vertex.isVisited()){
                dfsWithStack(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex root){
        root.setVisited(true);
        this.stack.push(root);

        while(!this.stack.isEmpty()){
            Vertex currentVertex = this.stack.pop();
            System.out.print(currentVertex + "  ");

            for(Vertex vertex: currentVertex.getNeighborList()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    this.stack.push(vertex);
                }
            }
        }
    }
}
