package com.socialComputing.p2.fileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.socialComputing.p2.core.Circle;
import com.socialComputing.p2.core.Graph;
import com.socialComputing.p2.core.Vertex;

public class CircleFileReader implements GraphFileReader {
	
	String fileLocation;
	
	public CircleFileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Graph graph = Graph.getInstance();
		String line;
		while((line = bufferedReader.readLine()) != null) {
			String circleInfo[] = line.trim().split("	");
			Circle circleObj = new Circle(circleInfo[0]);
			for(int i = 1;i < circleInfo.length; i++){
				int vertexId = Integer.parseInt(circleInfo[i]);
				Vertex vertex;
				if(graph.nodeMap.containsKey(vertexId)) {
					vertex = graph.nodeMap.get(vertexId);
					vertex.getCircleSet().add(circleObj);
					circleObj.memberVertices.add(vertex);
				}
				else {
					vertex = new Vertex(vertexId);
					vertex.getCircleSet().add(circleObj);
					graph.nodeMap.put(vertexId, vertex);
					circleObj.memberVertices.add(vertex);
				}
			}
		}
		bufferedReader.close();
	}

}
