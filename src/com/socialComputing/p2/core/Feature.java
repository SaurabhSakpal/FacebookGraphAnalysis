package com.socialComputing.p2.core;
import java.util.HashSet;

public class Feature {
	public Integer featureId;
	public String featureName;
	public Integer dependentFeatureId;
	
	public HashSet<Vertex> vertexFeatureSet = new HashSet <Vertex>(); 
	
	public Feature(int featureId, String featureName,int dependentFeatureId) {
		this.featureId = featureId;
		this.featureName = featureName;
		this.dependentFeatureId = dependentFeatureId;
	}

}
