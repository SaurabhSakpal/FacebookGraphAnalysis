import java.util.LinkedList;

public class Vertex {
	private Integer vertexId;
	private LinkedList<Circle> circleList;
	
	public Integer getVertexId() {
		return vertexId;
	}
	
	public void setVertexId(Integer vertexId) {
		this.vertexId = vertexId;
	}
	
	public LinkedList<Circle> getCircleList() {
		return circleList;
	}
	
	public void setCircleList(LinkedList<Circle> circleList) {
		this.circleList = circleList;
	}
	
	public Vertex(Integer vertexId) {
		this.vertexId = vertexId;
		this.circleList = new LinkedList<Circle>();
	}
}
