import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CircleFileReader implements GraphFileReader {
	
	String fileLocation;
	
	public CircleFileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Graph graph;
		if(Graph.singletonInstance == null) {
			Graph.singletonInstance = new Graph();
		}
		graph = Graph.singletonInstance;
		String line;
		while((line = bufferedReader.readLine()) != null) {
			String circleInfo[] = line.trim().split("	");
			Circle circleObj = new Circle(circleInfo[0]);
			for(int i = 1;i < circleInfo.length; i++){
				int vertexId = Integer.parseInt(circleInfo[i]);
				Vertex vertex;
				if(graph.nodeMap.containsKey(vertexId)) {
					vertex = graph.nodeMap.get(vertexId);
					vertex.getCircleList().add(circleObj);
					circleObj.memberVertices.add(vertex);
				}
				else {
					vertex = new Vertex(vertexId);
					vertex.getCircleList().add(circleObj);
					graph.nodeMap.put(vertexId, vertex);
					circleObj.memberVertices.add(vertex);
				}
			}
		}
		bufferedReader.close();
	}

}