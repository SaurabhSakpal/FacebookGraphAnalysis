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
		
		Config.initialize();
		
		for(int egoNetworkId : Config.EGO_NETWORKS) {
			System.out.println("--------------------------- EGO " + egoNetworkId + " NETWORK STATISTICS ---------------------------");
				
			EdgeListReader edgeListFileReader = new EdgeListReader(Config.egoEdgeMap.get(egoNetworkId));
			edgeListFileReader.readFile();
			
			CircleFileReader circleFileReader = new CircleFileReader(Config.egoCircleMap.get(egoNetworkId));
			circleFileReader.readFile();
			
			FeatureNamesFileReader featureNameReader = new FeatureNamesFileReader(Config.egoFeatureNamesMap.get(egoNetworkId));
			featureNameReader.readFile();
			
			AlterFeatureFileReader alterFeatureReader = new AlterFeatureFileReader(Config.egoAlterFeatureMap.get(egoNetworkId));
			alterFeatureReader.readFile();
			
			Graph.getInstance().updateAlterAndEdgeCount();
			betweennessCentrality();
			
			new Hypothesis().proveFirstHypothesis();
			
			Graph.flush();
		}
		
	}

}

