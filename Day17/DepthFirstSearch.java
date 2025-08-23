package com.week3;

import java.util.*;

class Graph {
    private int V;  // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adj[v].add(w); // directed graph
        // adj[w].add(v); // uncomment for undirected graph
    }

    // DFS function
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }

    // Recursive helper
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }
}

public class DepthFirstSearch {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("DFS starting from node 0:");
        g.DFS(0);  // Output: 0 1 3 2 4
    }
}