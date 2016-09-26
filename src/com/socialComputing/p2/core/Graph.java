package com.socialComputing.p2.core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	public HashMap<Vertex, HashSet<Vertex>> listRepresentation = new HashMap<Vertex, HashSet<Vertex>>();
	public HashMap<Integer, Vertex> nodeMap = new HashMap<Integer, Vertex>();
	public int totalEdgeCount;
	public int totalAlterCount;
	
	public ArrayList<Feature> featureNames = new ArrayList<Feature>();
	
	public void updateAlterAndEdgeCount() {
		this.totalAlterCount = this.nodeMap.size();
		this.totalEdgeCount = this.totalEdgeCount + this.totalAlterCount;
		System.out.println("Edge Count (including edges from ego nodes to alter nodes): " + this.totalEdgeCount);
		System.out.println("Node Count (including ego node) : "+ (this.totalAlterCount + 1));
	}
	
	private static Graph singletonInstance;
	
	public static Graph getInstance() {
		if(singletonInstance == null)
		{
			singletonInstance = new Graph();
		}
		return singletonInstance;
	}

	public static void flush() {
		singletonInstance = null;
	}
	
	public void betweennessCentrality() {
		int betweennessCentrality = 0;
		for(int vertexId : this.nodeMap.keySet()) {
			if(this.listRepresentation.containsKey(this.nodeMap.get(vertexId))) {
				betweennessCentrality += (this.totalAlterCount - this.listRepresentation.get(this.nodeMap.get(vertexId)).size());
			}
			else {
				betweennessCentrality += this.totalAlterCount;
			}
		}
		System.out.println("Betweeness Centrality : " + betweennessCentrality);
	}
}
