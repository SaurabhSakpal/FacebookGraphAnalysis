import java.util.HashSet;

public class Feature {
	Integer featureId;
	String featureName;
	Integer dependentFeatureId;
	
	public HashSet<Vertex> vertexFeatureSet = new HashSet <Vertex>(); 
	
	public Feature(int featureId, String featureName,int dependentFeatureId) {
		this.featureId = featureId;
		this.featureName = featureName;
		this.dependentFeatureId = dependentFeatureId;
	}

}
