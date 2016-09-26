package com.socialComputing.p2.core;
import java.util.HashSet;
import java.util.LinkedList;

public class Vertex {
	private Integer vertexId;
	private HashSet<Circle> circleSet;
	
	private boolean featureArray[];
	
	public boolean[] getFeatureArray() {
		return featureArray;
	}

	public void initializeFeatureArray(int size) {
		this.featureArray = new boolean[size];
	}
	
	public Integer getVertexId() {
		return vertexId;
	}
	
	public void setVertexId(Integer vertexId) {
		this.vertexId = vertexId;
	}
	
	public HashSet<Circle>  getCircleSet() {
		return circleSet;
	}
	
	public void setCircleSet(HashSet<Circle>  circleSet) {
		this.circleSet = circleSet;
	}
	
	public Vertex(Integer vertexId) {
		this.vertexId = vertexId;
		this.circleSet = new HashSet<Circle>();
	}
}
