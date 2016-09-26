
public class Hypothesis {
	
	public void proveFirstHypothesis() {
		Graph graph = Graph.getInstance();
		int total_count = 0;
		int hypothesis_true_count = 0;
		for(Feature feature : graph.featureNames) {
			if(feature.featureName.indexOf("education") != -1 && feature.featureName.indexOf("school") != -1) {
				for(Vertex vertex : feature.vertexFeatureSet) {
					for(Vertex temp : feature.vertexFeatureSet) {
						if(!vertex.equals(temp)) {
							for(Circle circle : vertex.getCircleSet()) {
								if(temp.getCircleSet().contains(circle)) {
									hypothesis_true_count++;
									break;
								}
							}
							total_count++;
						}
						
					}
				}
			}
		}
		System.out.println("Total Count Of Vertices Having Same University : "+total_count);
		System.out.println("Total Count of Vertices Having Same University and Belonging to Same Circle : "+hypothesis_true_count);
		
		float percentage_correctness  = (float)hypothesis_true_count/((float)total_count);
		System.out.println("Percentage correctness of First Hypothesis for current Ego Network is : "+ (percentage_correctness*100)+"%");
	}
	
	public void proveSecondHypothesis() {
		
	}

}
