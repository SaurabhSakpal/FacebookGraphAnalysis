import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	HashMap<Vertex, HashSet<Vertex>> listRepresentation = new HashMap<Vertex, HashSet<Vertex>>();
	HashMap<Integer, Vertex> nodeMap = new HashMap<Integer, Vertex>();
	int totalEdgeCount;
	int totalAlterCount;
	
	public void updateAlterAndEdgeCount() {
		this.totalAlterCount = this.nodeMap.size();
		this.totalEdgeCount = this.totalEdgeCount + this.totalAlterCount;
		System.out.println("Edge Count : " + this.totalEdgeCount);
		System.out.println("Node Count : "+ this.totalAlterCount);
	}
	
	public static Graph singletonInstance;
	
	public static Graph getInstance() {
		return singletonInstance;
	}
}
