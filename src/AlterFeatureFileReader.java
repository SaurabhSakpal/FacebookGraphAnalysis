import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlterFeatureFileReader implements GraphFileReader {
	String fileLocation;
	
	public AlterFeatureFileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Graph graph = Graph.getInstance();

		String line;
		while((line = bufferedReader.readLine()) != null) {
			String featureInfo[] = line.trim().split(" ");
			int vertexId = Integer.parseInt(featureInfo[0]);
			Vertex vertex;
			if(!graph.nodeMap.containsKey(vertexId)) {
				vertex = new Vertex(vertexId);
				graph.nodeMap.put(vertexId, vertex);
			}
			vertex = graph.nodeMap.get(vertexId);
			vertex.initializeFeatureArray(graph.featureNames.size());
			for(int i = 1; i < featureInfo.length; i++) {
				if(featureInfo[i].equals("1")) {
					vertex.getFeatureArray()[i-1] = true;
				}
				else if(featureInfo[i].equals("0")) {
					vertex.getFeatureArray()[i-1] = false;
				}
			}
			//System.out.println("Features Added : "+vertexId+" : "+ vertex.getFeatureArray().length );
		}
		bufferedReader.close();	
	}
	

}
