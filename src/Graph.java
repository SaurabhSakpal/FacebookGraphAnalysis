import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	HashMap<Vertex, HashSet<Vertex>> listRepresentation = new HashMap<Vertex, HashSet<Vertex>>();
	HashMap<Integer, Vertex> nodeMap = new HashMap<Integer, Vertex>();
	int totalEdgeCount;
	int totalAlterCount;
}
