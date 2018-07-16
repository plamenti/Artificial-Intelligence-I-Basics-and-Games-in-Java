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
                System.out.println("With stack:");
                dfsWithStack(vertex);
                System.out.println();
                System.out.println("With recursion:");
                dfsWithRecursion(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex root){
        root.setVisited(true);
        this.stack.push(root);

        while(!this.stack.isEmpty()){
            Vertex currentVertex = this.stack.pop();
            System.out.print(currentVertex + "    ");

            for(Vertex vertex: currentVertex.getNeighborList()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    this.stack.push(vertex);
                }
            }
        }
    }

    private void dfsWithRecursion(Vertex root){
        System.out.print(root + "    ");
        root.setVisited(true);

        for(Vertex vertex : root.getNeighborList()){
            dfsWithRecursion(vertex);
        }
    }
}
