import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class EdgeListReader implements GraphFileReader {
	
	String fileLocation;
	
	public EdgeListReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		Graph graph = Graph.getInstance();
		
		String line;
		int count = 0;
		while((line = bufferedReader.readLine()) != null) {
			String arr[] = line.trim().split(" ");
			int sourceId = Integer.parseInt(arr[0]);
			int destinationId =Integer.parseInt(arr[1]);
			Vertex sourceVertex;
			Vertex destinationVertex;
			if(graph.nodeMap.containsKey(destinationId)) {
				destinationVertex = graph.nodeMap.get(destinationId);
			}
			else {
				destinationVertex = new Vertex(destinationId);
				graph.nodeMap.put(destinationId, destinationVertex);
			}
			
			if(graph.nodeMap.containsKey(sourceId)) {
				sourceVertex = graph.nodeMap.get(sourceId);
				HashSet<Vertex> set;
				if((set = graph.listRepresentation.get(sourceVertex)) != null) {
					set.add(destinationVertex);
				}
				else {
					set = new HashSet<Vertex>();
					set.add(destinationVertex);
					graph.listRepresentation.put(sourceVertex, set);
				}
			}
			else {
				sourceVertex = new Vertex(sourceId);
				graph.nodeMap.put(sourceId, sourceVertex);
				HashSet<Vertex> neighbourSet = new HashSet<Vertex>();
				neighbourSet.add(destinationVertex);
				graph.listRepresentation.put(sourceVertex, neighbourSet);
			}
			count++;
		}
		graph.totalEdgeCount = count/2 ;
		bufferedReader.close();
	}

}
