package com.plamenti;

import java.util.Stack;

public class IDDFS{
    private Vertex targetVertex;
    private volatile boolean isTargetFound;

    public IDDFS(Vertex vertex){
        this.targetVertex = vertex;
        this.isTargetFound = false;
    }

    public void runDeepeningSearch(Vertex root){
        int depth = 0;

        while(!isTargetFound){
            System.out.println();
            dfs(root, depth);
            depth++;
        }
    }

    private void dfs(Vertex root, int depth){
        Stack<Vertex> stack = new Stack<Vertex>();
        root.setDepthLevel(0);
        stack.push(root);

        while(!stack.isEmpty()){
            Vertex currentVertex = stack.pop();
            System.out.print(currentVertex + "    ");

            if(currentVertex.getName().equals(this.targetVertex.getName())){
                System.out.println();
                System.out.println("Node found!");
                this.isTargetFound = true;
                return;
            }

            if(currentVertex.getDepthLevel() > depth){
                continue;
            }

            for(Vertex vertex : currentVertex.getNeighbors()){
                vertex.setDepthLevel(currentVertex.getDepthLevel() + 1);
                stack.push(vertex);
            }
        }
    }
}
