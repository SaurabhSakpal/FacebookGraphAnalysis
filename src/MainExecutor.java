import java.io.IOException;

public class MainExecutor {
	
	
	public static void betweennessCentrality() {
		Graph graph = Graph.getInstance();
		int betweennessCentrality = 0;
		for(int vertexId : graph.nodeMap.keySet()) {
			if(graph.listRepresentation.containsKey(graph.nodeMap.get(vertexId))) {
				betweennessCentrality += (graph.totalAlterCount - graph.listRepresentation.get(graph.nodeMap.get(vertexId)).size());
			}
			else {
				betweennessCentrality += graph.totalAlterCount;
			}
		}
		System.out.println("Betweeness Centrality : " + betweennessCentrality);
	}

	public static void main(String[] args) throws IOException {
		
		EdgeListReader edgeListFileReader = new EdgeListReader("/home/saurabh/workspace_2/FacebookGraphAnalysis/resources/0.edges");
		edgeListFileReader.readFile();
		CircleFileReader circleFileReader = new CircleFileReader("/home/saurabh/workspace_2/FacebookGraphAnalysis/resources/0.circles");
		circleFileReader.readFile();
		FeatureFileReader featureReader = new FeatureFileReader("/home/saurabh/workspace_2/FacebookGraphAnalysis/resources/0.feat");
		featureReader.readFile();
		
		
		
		Graph.getInstance().updateAlterAndEdgeCount();
		
		betweennessCentrality();
	}

}

