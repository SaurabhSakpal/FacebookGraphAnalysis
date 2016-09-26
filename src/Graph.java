import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	HashMap<Vertex, HashSet<Vertex>> listRepresentation = new HashMap<Vertex, HashSet<Vertex>>();
	HashMap<Integer, Vertex> nodeMap = new HashMap<Integer, Vertex>();
	int totalEdgeCount;
	int totalAlterCount;
	
	ArrayList<Feature> featureNames = new ArrayList<Feature>();
	
	public void updateAlterAndEdgeCount() {
		this.totalAlterCount = this.nodeMap.size();
		this.totalEdgeCount = this.totalEdgeCount + this.totalAlterCount;
		System.out.println("Edge Count (including edges from ego nodes to alter nodes): " + this.totalEdgeCount);
		System.out.println("Node Count (including ego node) : "+ (this.totalAlterCount + 1));
	}
	
	private static Graph singletonInstance;
	
	public static Graph getInstance() {
		if(singletonInstance == null)
		{
			singletonInstance = new Graph();
		}
		return singletonInstance;
	}

	public static void flush() {
		singletonInstance = null;
	}
}
