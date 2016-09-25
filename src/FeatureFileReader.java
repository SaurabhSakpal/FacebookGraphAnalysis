import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FeatureFileReader implements GraphFileReader {
	String fileLocation;
	
	public FeatureFileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Graph graph;
		if(Graph.getInstance() == null) {
			Graph.singletonInstance = new Graph();
		}
		graph = Graph.singletonInstance;
		String line;
		while((line = bufferedReader.readLine()) != null) {
			String featureInfo[] = line.trim().split(" ");
			int vertexId = Integer.parseInt(featureInfo[0]);
			if(!graph.nodeMap.containsKey(vertexId)) {
				Vertex vertex = new Vertex(vertexId);
				graph.nodeMap.put(vertexId, vertex);
			}
		}
		bufferedReader.close();	
	}
	

}
