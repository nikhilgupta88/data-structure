package com.ng.learning.ds.graph;

import org.junit.Test;

import com.ng.learning.ds.graph.Graph;
import com.ng.learning.ds.graph.GraphRepresentation;

public class TestGraphRepresentation {

	@Test
	public void addEdge() {
		int v = 5;
		Graph gr = new Graph(5);
		gr.addEdge(0, 1, 0);
		gr.addEdge(0, 4, 0);
		gr.addEdge(1, 2, 0);
		gr.addEdge(1, 3, 0);
		gr.addEdge(1, 4, 0);
		gr.addEdge(2, 3, 0);
		gr.addEdge(3, 4, 0);
		System.out.println(gr);
	}
	@Test
	public void BFS() {
		GraphRepresentation gr = new GraphRepresentation();
		GraphRepresentation.Graph g = gr.new Graph(4);
	    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
        gr.BFS(g,2);
	}
	@Test
	public void DFS() {
		GraphRepresentation gr = new GraphRepresentation();
        GraphRepresentation.Graph g = gr.new Graph(4);
	    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
        gr.DFS(g,2);
	}

}
