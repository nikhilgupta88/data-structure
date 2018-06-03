package com.example.data_structure.graph;

import java.util.*;

public class GraphRepresentation {
	public class Graph {
		private int v; // no. of Vertices
		private List<Integer> G[]; // Adjacency List

		public Graph(int v) {
			this.v = v;
			G = new LinkedList[v];
			for (int i = 0; i < G.length; i++) {
				G[i] = new LinkedList();
			}
		}

		@Override
		public String toString() {
			String result = "";
			for (int i = 0; i < G.length; i++)
				result += i + " =>" + G[i] + "\n";
			return result;
		}

		public void addEdge(int u, int v) {
			G[u].add(v);
		}
	}

	public void BFS(Graph g, int s) {
		boolean[] visited = new boolean[g.v];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");

			Iterator<Integer> i = g.G[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public void DFSUtil(Graph g, int s, boolean[] visited) {
		visited[s] = true;
		System.out.print(s + " ");

		Iterator<Integer> i = g.G[s].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				DFSUtil(g, n, visited);
			}
		}
	}

	public void DFS(Graph g, int s) {
		boolean[] visited = new boolean[g.v];
		DFSUtil(g, s, visited);
	}
}
